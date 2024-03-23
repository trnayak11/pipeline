def call(repo){    
    steps.checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'gopa1990', url: repo]])  
}
