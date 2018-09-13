$(document).ready(function() {
	
	// Open modal confirm delete
    $(".jsBtnConfirmDelete").on("click", function() {
    	var href = $(this).attr("myhref");
    	var btnDelete = $(".jsConfirmDeleteModal").find(".jsBtnDelete").attr("href", href);
    	$(".jsConfirmDeleteModal").show();
    })
    
    // Close modal
    $(".jsCloseModal").on("click", function() {
    	$(".jsConfirmDeleteModal").hide();
    })
} );