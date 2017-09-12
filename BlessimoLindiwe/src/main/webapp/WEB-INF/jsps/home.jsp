<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Blessimo Application</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1" />
<script
	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.6.0/angular.min.js"></script>
<script src="/js/angular.js"></script>
<link rel="stylesheet"
	href="http://netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" />
</head>
<body>
	<div class="container" ng-app="app">
		<h1>Welcome to Blessimo Online Store </h1>

		<div class="row">
			<div ng-controller="postController" class="col-md-3">
				<form name="productForm" ng-submit="submitForm">
					<label>ProductName</label>
					<input type="text" name="name"	class="form-control" ng-model="name" />
					<label>Price</label>
					<input type="text" name="price" class="form-control" ng-model="price" />
					<label>ProductDescription</label>
					<input type="text" name="description"	class="form-control" ng-model="description" />
					<label>Size</label>
					<input type="text" name="size" class="form-control" ng-model="size" />
					<label>Image</label>
					<input type="text" name="image" class="form-control" ng-model="image" />
					<label>Line</label>
					<input type="text" name="line" class="form-control" ng-model="line" />
					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
				<p>{{postResultMessage}}</p>
			</div>
		</div>
		<div class="row">
			<div ng-controller="getallproductsController" class="col-md-3">
				<h3>All Products</h3>

				<button ng-click="getAllProducts()">Get All Products</button>

				<div ng-show="showAllProducts">
					<ul class="list-group">
						<li ng-repeat="product in allproducts.data"><h4 class="list-group-item">
								<strong>Products {{$index}}</strong><br />
								Id: {{product.id}}<br />
								Product Name: {{product.name}}<br />
								Product Price: {{product.price}}<br/>
								Product Description: {{product.description}}<br />
								Product Size: {{product.size}}<br />
								Product Image: {{product.image}}<br />
								Product Line: {{product.line}}
						</h4></li>
					</ul>
				</div>
				<p>{{getResultMessage}}</p>
			</div>

			<div ng-controller="getproductController" class="col-md-3">
				<h3>Product by ID</h3>

				<input type="text" class="form-control" style="width: 100px;"
					ng-model="productId" /> <br />
				<button ng-click="getProduct()">Get Product</button>

				<div ng-show="showProduct">
					Id: {{product.data.id}}<br />
					Product Name: {{product.data.name}}<br />
					Product price : {{product.data.price}} <br />
					Product Description: {{product.data.description}}<br />
					Product Size: {{product.data.size}}<br />
					Product Image: {{product.data.image}}<br />
					Product Line: {{product.data.line}}
						
				</div>
				<p>{{getResultMessage}}</p>
			</div>
		</div>
	</div>
</body>
</html>