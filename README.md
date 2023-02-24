## Micronaut GCP pub/sub based app

Configure a GCP project and pub/sub topic and subscription - https://cloud.google.com/pubsub

You'll need some way to authenticate yourself, in this example I'm using a service account key file referenced in 
application.yml - https://cloud.google.com/iam/docs/service-accounts

You can publish a simple text message from:
`http://localhost:8080/api/publish/YOURMESSAGE`

Or maybe POST a Fish like:
`curl --location 'http://localhost:8080/api/fish' \
--header 'Content-Type: application/json' \
--data '{
"name": "Jon"
}'`

And see it picked up and printed in the console by the listener.