def call(){
    
    steps.sshagent(['ubuntu']) { sh "scp -i /root/tomcat.pem -o StrictHostKeyChecking=no /workspace/workspace/Cloud_Formation/target/MyWebApp.war ubuntu@54.206.119.26:/opt/tomcat/webapps" }
    
}