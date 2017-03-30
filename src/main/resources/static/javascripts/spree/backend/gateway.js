$(function() {
  var original_gtwy_type = $('#gtwy-type').prop('value');
  $('div#gateway-settings-warning').hide();
  $('#gtwy-type').change(function() { 
    if ($('#gtwy-type').prop('value') == original_gtwy_type) {
      $('div.gateway-settings').show();
      $('div#gateway-settings-warning').hide();
    } else {
      $('div.gateway-settings').hide();
      $('div#gateway-settings-warning').show();
    }
  });
})
