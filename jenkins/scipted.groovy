node {  
    stage('PULL') { 
        git branch: 'cdec-b48', url: 'https://github.com/shubhamkalsait/EasyCRUD.git'
 
    }
    stage('BUILD') { 
        echo 'BUILD SUCCESS'

    }
    stage('Test') { 
         echo 'TEST SUCCESS'
    }
    stage('Deploy') { 
         echo 'DEPLOY SUCCESS'
    }
}