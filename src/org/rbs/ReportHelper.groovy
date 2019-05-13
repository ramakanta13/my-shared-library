def call(String name = 'Report') {
   echo "Hello, ${name}."
}
call 'Reportcalled'
call()


// even or odd number function

def evenOrOddNumber(int buildNumber) {

  if (buildNumber % 2 == 0) {

    pipeline {

      agent any

      stages {

        stage('Even Stage') {

          steps {

            echo "The build number is even"

          }

        }

      }

    }

  } else {

    pipeline {

      agent any

      stages {

        stage('Odd Stage') {

          steps {

            echo "The build number is odd"

          }

        }

      }

    }

  }

}
