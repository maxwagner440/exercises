﻿/// <reference path="../jquery-3.1.1.js" />

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
	
	
	$("tbody").on('keypress', function(){
		if(event.key === 'ArrowDown'){
			$('')
		}
		else if(event.key === 'ArrowUp'){
			
		}
		else if(event.key === 'ArrowLeft'){
			
		}
		else if(event.key === 'ArrowRight'){
			
		}
	})
});

function grandTotal(){
	var subtotal = $('#subtotal span').text();
	subtotal = parseFloat(subtotal.substring(1, subtotal.length)).toFixed('2');
	
	var tax = $('#tax span').text();
	tax = parseFloat(tax.substring(1, tax.length)).toFixed('2');
	
	var shipping = $('#shipping span').text();
	shipping = parseFloat(shipping.substring(1, shipping.length)).toFixed('2');
	
	var grandTotal = subtotal + tax + shipping;
	$('#order-summary #grandtotal span').text('$' + grandTotal).toFixed('2');
	
}