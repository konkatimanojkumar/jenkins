def gitdownload(repo)
{
    git "https://github.com/intelliqittrainings/${repo}"
}
def gitbuild()
{
    sh 'mvn package'
}
