/// <reference path="../jquery-3.1.1.js" />

$(document).ready(function () {

	$("#SameShipping").on('click', function(){
		if(this.checked){
			$("#ShippingAddress1").val($("#BillingAddress1").val());
			$("#ShippingAddress2").val($("#BillingAddress2").val());
			$("#ShippingCity").val($("#BillingCity").val());
			$("#ShippingState").val($("#BillingState").val());
			$("#ShippingPostalCode").val($("#BillingPostalCode").val());
		}
		else{
			$("#ShippingAddress1").val("");
			$("#ShippingAddress2").val("");
			$("#ShippingCity").val("");
			$("#ShippingState").val("");
			$("#ShippingPostalCode").val("");
		}
	});
	
	$('input[name=ShippingType]').on('change', function(){
		var shippingAmount = $("input[name=ShippingType]:checked").attr('data-cost');
		$('#order-summary #shipping span').text('$' + shippingAmount);
		grandTotal();
	});
	
	
	
});

function grandTotal(){
	var subtotal = $('#subtotal span').text();
	subtotal = parseFloat(subtotal.substring(1, subtotal.length));
	
	var tax = $('#tax span').text();
	tax = parseFloat(tax.substring(1, tax.length));
	
	var shipping = $('#shipping span').text();
	shipping = parseFloat(shipping.substring(1, shipping.length));
	
	var grandTotal = subtotal + tax + shipping;
	$('#order-summary #grandtotal span').text('$' + grandTotal);
	
}