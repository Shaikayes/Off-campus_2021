kubectl create deployment hoteldep --image=ayesha786/hotel-service:1.0
kubectl get deployments
kubectl expose deployment hoteldep --type=LoadBalancer --name=hotel-service --port=5050
kubectl get services
curl -v http://localhost:5050/hotels