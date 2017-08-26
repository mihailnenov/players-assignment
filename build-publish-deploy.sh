#!/bin/bash

export GCLOUD_PROJECT=$1


if [ ! ${GCLOUD_PROJECT} ]; then echo "Please provide GCloud project name!"; exit 1; fi

# Build Docker container
[ $? -eq 0 ] && docker build -t gcr.io/${GCLOUD_PROJECT}/football-players:v0.0.1 .

# Push Docker container to the registry
[ $? -eq 0 ] && gcloud docker -- push gcr.io/${GCLOUD_PROJECT}/football-players:v0.0.1

# Deploy both service to Kubernetes
[ $? -eq 0 ] && kubectl create -f ./kubernetes.yaml