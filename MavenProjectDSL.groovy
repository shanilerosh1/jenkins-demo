job("First-Maven-project-via-dsm"){
    description("This is a Maven project")
    scm {
        git("https://github.com/shanilerosh1/jenkins-demo.git", 'master')
    }
    triggers {
        scm("* * * * *")
    }
    steps {
        maven('clean package', '-f java-tomcat-sample/pom.xml')
    }
    publishers {
        archiveArtifacts '**/*.war'
    }

}