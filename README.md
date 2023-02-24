## Micronaut GCP pub/sub based app
https://cloud.google.com/pubsub

You'll need a GCP account and the CLI.

First create the subscriptions and topics, you can do this in the console or from the CLI:

`gcloud pubsub subscriptions create words-sub --topic=words`

`gcloud pubsub subscriptions create fish-sub --topic=fish`

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

You'll see both picked up and printed in the console by the listener.