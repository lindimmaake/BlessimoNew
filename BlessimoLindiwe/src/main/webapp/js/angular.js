var app = angular.module('app',[]);
	app.controller('postController',function($scope,$http,$location)
	{
		
		$scope.submitForm =function()
		{
			var url = $location.absUrl()+"postitem";
			var config = 
			{
					headers: 
					{
						'Content-Type':'application/json;charset=utf-8;'
					}
			}
			var data =
			{
					name:$scope.name,
				
					price: $scope.price,
					
					description: $scope.description,
					
					size: $scope.size,
					
					image:$scope.image,
					
					line:$scope.line
			};
			$http.post(url, data, config).then(function (response) {
				
				$scope.postResultMessage = "Sucessful!";
			}, function (response) {
				$scope.postResultMessage = "Fail!";
			});
			
			$scope.name=""
			
			$scope.price=""
			
			$scope.description=""
			
			$scope.size=""
			
			$scope.image=""
			
			$scope.line=""

		}
		
		
	});
	
	app.controller('getallproductsController',function($scope,$http,$location)
			{
		
				$scope.showProduct =false;
				$scope.getAllProducts = function()
				{
					
					var url =$location.absUrl()+"findall";
					var config =
					{
							headers : 
							{
								'Content-Type':'application/json;charset=utf-8;'

							}
					}
					
					$http.get(url, config).then(function(response) {

						if (response.data.status == "Done") {
							$scope.allProducts = response.data;
							$scope.showAllProducts = true;

						} else {
							$scope.getResultMessage = "get All Products Data Error!";
						}

					}, function(response) {
						$scope.getResultMessage = "Fail!";
					});
					
				}
		
		
			});
	app.controller('getproductController', function($scope, $http, $location) {
		
		$scope.showProduct = false;
		
		$scope.getProduct = function() {
			var url = $location.absUrl() + "product/"+$scope.id;

			var config = {
				headers : {
					'Content-Type':'application/json;charset=utf-8;'
				}
			}

			$http.get(url, config).then(function(response) {

				if (response.data.status == "Done") {
					$scope.product = response.data;
					$scope.showProduct = true;

				} else {
					$scope.getResultMessage = "Product Data Error!";
				}

			}, function(response) {
				$scope.getResultMessage = "Fail!";
			});

		}
	});