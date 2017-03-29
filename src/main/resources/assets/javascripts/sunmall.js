window.Sunmall = (function() {
  function Sunmall() {}

  Sunmall.ready = function(callback) {
    jQuery(document).ready(callback);
    return jQuery(document).on('page:load', function() {
      return callback(jQuery);
    });
  };

  Sunmall.mountedAt = function() {
    return window.SunmallPaths.mounted_at;
  };

  Sunmall.adminPath = function() {
    return window.SunmallPaths.admin;
  };

  Sunmall.pathFor = function(path) {
    var locationOrigin;
    locationOrigin = (window.location.protocol + "//" + window.location.hostname) + (window.location.port ? ":" + window.location.port : "");
    return this.url("" + locationOrigin + (this.mountedAt()) + path, this.url_params).toString();
  };

  Sunmall.adminPathFor = function(path) {
    return this.pathFor("" + (this.adminPath()) + path);
  };

  Sunmall.url = function(uri, query) {
    if (uri.path === void 0) {
      uri = new Uri(uri);
    }
    if (query) {
      $.each(query, function(key, value) {
        return uri.addQueryParam(key, value);
      });
    }
    return uri;
  };

  Sunmall.ajax = function(url_or_settings, settings) {
    var url;
    if (typeof url_or_settings === "string") {
      return $.ajax(Sunmall.url(url_or_settings).toString(), settings);
    } else {
      url = url_or_settings['url'];
      delete url_or_settings['url'];
      return $.ajax(Sunmall.url(url).toString(), url_or_settings);
    }
  };

  Sunmall.routes = {
    states_search: Sunmall.pathFor('api/v1/states'),
    apply_coupon_code: function(order_id) {
      return Sunmall.pathFor("api/v1/orders/" + order_id + "/apply_coupon_code");
    }
  };

  Sunmall.url_params = {};

  return Sunmall;

})();

// ---
// generated by coffee-script 1.9.2