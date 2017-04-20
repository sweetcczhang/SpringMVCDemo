#!/bin/bash
echo "复制war包"
tomcat_home=/home/zcc/software/apache-tomcat-8.5.8
tomcatstart=/home/zcc/software/apache-tomcat-8.5.8/bin
echo "kill tomcat $tomcat_home"
ID=`ps -ef | grep java | grep $tomcat_home|awk '{print $2}'`
for id in $ID
do
   kill -9 $id
   echo "killed pid=$id"
done
rm $tomcat_home/webapps/SpringMVCDemo.war
cp /var/lib/jenkins/workspace/SpringMVCdemo/target/SpringMVCDemo.war $tomcat_home/webapps
echo "执行shell脚本启动tomcat"
#防止jenkins构建完成后杀死tomcat进程
export BUILD_ID=dontKillMe
sh $tomcatstart/startup.sh
