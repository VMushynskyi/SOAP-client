node {
   stage('SCM Checkout'){  
	   git: 'https://github.com/VMushynskyi/SOAP-client'
   }
   stage('SCM Checkout'){
      def mvnHome = tool name: 'maven-3', type: 'maven'
      sh "${mvnHome}/bin/mvn package"
	 }
      
}
