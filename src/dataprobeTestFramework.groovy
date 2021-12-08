pipelineJob(" dataprobe TestFrame "){
    description("""Deploy dataprobe TestFrame to different Layers <br/>
   <font color="red">***This job was automatically generated by the seed job. DO NOT EDIT!</font>""")

    parameters {
        //choiceParam('SELECT ENVIRONMENT',['dev-db (default)','qa-db','prod-db'])
        stringParam('env','dev')
    }

    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        name 'origin'
                        url('https://github.com/Charles-16/maven-project.git')
                        credentials "Git Credentials"
                    }
                    branch("**")
                }
            } //scm
            scriptPath("src/TestFrameWork.pipeline")
        } //cpsScm
    } //definition
} //pipeline
