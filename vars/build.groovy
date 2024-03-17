def call(body){
    def pipelineParams = [: ]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = pipelineParams
    body()
    println "pipelineparams: ${pipelineParams}"
       pipeline{
       agent { label 'linux' }
    //    agent any
       parameters{
                string(defaultValue: 'demo-1',name: 'gitRepo',trim: true)
            }
       stages{ 
            stage("print"){
                steps{
                   script{
                    echo "parameters : $params.gitRepo"
                   }
                }
            } 
            stage('code polling') {
                steps {
                    script{
                        checkout.call(params.gitRepo)
                        }
                    }
                }
            stage('code build') {
                steps {
                    script{
                            mvnbuildscriptLoad()
                        }
                    }
                }
            stage('DEPLOY') {
                steps {
                    script{
                        deploy.call()
                        }
                    }
                }
        }
    }
}