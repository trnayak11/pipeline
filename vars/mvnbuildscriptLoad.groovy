def call(){
    sh '''
       export PATH=/opt/apache-maven-3.6.3/bin:$PATH
       mvn clean install
    '''
}
