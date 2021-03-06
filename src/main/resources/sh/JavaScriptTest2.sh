#!/bin/sh
# ----------------------------------------------------------------------------
#  Copyright 2001-2006 The Apache Software Foundation.
#
#  Licensed under the Apache License, Version 2.0 (the "License");
#  you may not use this file except in compliance with the License.
#  You may obtain a copy of the License at
#
#       http://www.apache.org/licenses/LICENSE-2.0
#
#  Unless required by applicable law or agreed to in writing, software
#  distributed under the License is distributed on an "AS IS" BASIS,
#  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#  See the License for the specific language governing permissions and
#  limitations under the License.
# ----------------------------------------------------------------------------
#
#   Copyright (c) 2001-2006 The Apache Software Foundation.  All rights
#   reserved.

#导入定时任务需要的环境变量配置
source /etc/profile

# resolve links - $0 may be a softlink
PRG="$0"

while [ -h "$PRG" ]; do
  ls=`ls -ld "$PRG"`
  link=`expr "$ls" : '.*-> \(.*\)$'`
  if expr "$link" : '/.*' > /dev/null; then
    PRG="$link"
  else
    PRG=`dirname "$PRG"`/"$link"
  fi
done

PRGDIR=`dirname "$PRG"`
BASEDIR=`cd "$PRGDIR/.." >/dev/null; pwd`



# OS specific support.  $var _must_ be set to either true or false.
cygwin=false;
darwin=false;
case "`uname`" in
  CYGWIN*) cygwin=true ;;
  Darwin*) darwin=true
           if [ -z "$JAVA_VERSION" ] ; then
             JAVA_VERSION="CurrentJDK"
           else
             echo "Using Java version: $JAVA_VERSION"
           fi
           if [ -z "$JAVA_HOME" ] ; then
             JAVA_HOME=/System/Library/Frameworks/JavaVM.framework/Versions/${JAVA_VERSION}/Home
           fi
           ;;
esac

if [ -z "$JAVA_HOME" ] ; then
  if [ -r /etc/gentoo-release ] ; then
    JAVA_HOME=`java-config --jre-home`
  fi
fi

# For Cygwin, ensure paths are in UNIX format before anything is touched
if $cygwin ; then
  [ -n "$JAVA_HOME" ] && JAVA_HOME=`cygpath --unix "$JAVA_HOME"`
  [ -n "$CLASSPATH" ] && CLASSPATH=`cygpath --path --unix "$CLASSPATH"`
fi

# If a specific java binary isn't specified search for the standard 'java' binary
if [ -z "$JAVACMD" ] ; then
  if [ -n "$JAVA_HOME"  ] ; then
    if [ -x "$JAVA_HOME/jre/sh/java" ] ; then
      # IBM's JDK on AIX uses strange locations for the executables
      JAVACMD="$JAVA_HOME/jre/sh/java"
    else
      JAVACMD="$JAVA_HOME/bin/java"
    fi
  else
    JAVACMD=`which java`
  fi
fi

if [ ! -x "$JAVACMD" ] ; then
  echo "Error: JAVA_HOME is not defined correctly." 1>&2
  echo "  We cannot execute $JAVACMD" 1>&2
  exit 1
fi

if [ -z "$REPO" ]
then
  REPO="$BASEDIR"/lib
fi

CLASSPATH=$CLASSPATH_PREFIX:"$BASEDIR"/conf:"$REPO"/junit-4.11.jar:"$REPO"/hamcrest-core-1.3.jar:"$REPO"/javaee-api-7.0.jar:"$REPO"/javax.mail-1.5.0.jar:"$REPO"/activation-1.1.jar:"$REPO"/spring-test-4.0.2.RELEASE.jar:"$REPO"/spring-core-4.0.2.RELEASE.jar:"$REPO"/commons-logging-1.1.3.jar:"$REPO"/spring-oxm-4.0.2.RELEASE.jar:"$REPO"/spring-beans-4.0.2.RELEASE.jar:"$REPO"/spring-tx-4.0.2.RELEASE.jar:"$REPO"/spring-jdbc-4.0.2.RELEASE.jar:"$REPO"/spring-aop-4.0.2.RELEASE.jar:"$REPO"/aopalliance-1.0.jar:"$REPO"/spring-context-4.0.2.RELEASE.jar:"$REPO"/spring-context-support-4.0.2.RELEASE.jar:"$REPO"/spring-expression-4.0.2.RELEASE.jar:"$REPO"/spring-orm-4.0.2.RELEASE.jar:"$REPO"/spring-web-4.0.2.RELEASE.jar:"$REPO"/spring-webmvc-4.0.2.RELEASE.jar:"$REPO"/mybatis-3.2.8.jar:"$REPO"/mybatis-spring-1.2.2.jar:"$REPO"/mysql-connector-java-5.1.35.jar:"$REPO"/commons-dbcp-1.4.jar:"$REPO"/commons-pool-1.5.4.jar:"$REPO"/jstl-1.2.jar:"$REPO"/log4j-1.2.17.jar:"$REPO"/slf4j-api-1.7.12.jar:"$REPO"/slf4j-log4j12-1.7.12.jar:"$REPO"/fastjson-1.2.6.jar:"$REPO"/jackson-mapper-asl-1.9.13.jar:"$REPO"/jackson-core-asl-1.9.13.jar:"$REPO"/commons-fileupload-1.3.1.jar:"$REPO"/commons-io-2.4.jar:"$REPO"/commons-codec-1.10.jar:"$REPO"/pagehelper-4.1.4.jar:"$REPO"/jsqlparser-0.9.5.jar:"$REPO"/java-script-0.0.1-SNAPSHOT.jar
EXTRA_JVM_ARGUMENTS="-Xms128m"

# For Cygwin, switch paths to Windows format before running java
if $cygwin; then
  [ -n "$CLASSPATH" ] && CLASSPATH=`cygpath --path --windows "$CLASSPATH"`
  [ -n "$JAVA_HOME" ] && JAVA_HOME=`cygpath --path --windows "$JAVA_HOME"`
  [ -n "$HOME" ] && HOME=`cygpath --path --windows "$HOME"`
  [ -n "$BASEDIR" ] && BASEDIR=`cygpath --path --windows "$BASEDIR"`
  [ -n "$REPO" ] && REPO=`cygpath --path --windows "$REPO"`
fi

exec "$JAVACMD" $JAVA_OPTS \
  $EXTRA_JVM_ARGUMENTS \
  -classpath "$CLASSPATH" \
  -Dapp.name="appTest" \
  -Dapp.pid="$$" \
  -Dapp.repo="$REPO" \
  -Dapp.home="$BASEDIR" \
  -Dbasedir="$BASEDIR" \
  com.cys.ssm.sh.JavaScriptTest2 \
  "$@"
