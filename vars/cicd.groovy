def gitdownload(repo)
{
    git "https://github.com/intelliqittrainings/${repo}"
}
def gitbuild()
{
    sh 'mvn package'
}
def gitdeploy(jobname,ip,appname)
{
    sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war   ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}
