job("First-Maven-project-via-dsm"){
    description("This is a Maven project")
    scm {
        git("https://github.com/shanilerosh1/jenkins-demo.git", 'master')
    }
    triggers {
        scm("* * * * *")
    }
    steps {
        maven('clean package', 'C:\\Users\\Shanil\\.jenkins\\workspace\\jsp-build\\java-tomcat-sample\\pom.xml')
    }
    publishers {
        archiveArtifacts 'target/*.war'
    }

}