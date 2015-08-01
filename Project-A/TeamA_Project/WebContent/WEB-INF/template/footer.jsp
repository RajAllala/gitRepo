<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<script src="<c:url value="/resources/js/prefixfree.min.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap-datetimepicker.js"/>"></script>
<script src="<c:url value="/resources/js/jquery.min.js"/>"></script>
<script src="<c:url value="/resources/js/jquery.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/resources/js/angular.min.js"/>"></script>
<script src="<c:url value="/resources/dashboard/d3.min.js"/>"></script>
<script src="<c:url value="/resources/dashboard/nv.d3.min.js"/>"></script>
<script src="<c:url value="/resources/dashboard/angular-nvd3.min.js"/>"></script>
<script src="<c:url value="/resources/js/myapp.js"/>"></script>
<script src="<c:url value="/resources/js/app.js"/>"></script>
<script type="text/javascript" src="http://plupload.com/plupload/js/plupload.full.min.js" charset="UTF-8"></script>
<script type="text/javascript" src="http://plupload.com/plupload/js/jquery.plupload.queue/jquery.plupload.queue.min.js" charset="UTF-8"></script>
<link type="text/css" rel="stylesheet" href="http://plupload.com/plupload//js/jquery.plupload.queue/css/jquery.plupload.queue.css" media="screen" />


    <script data-require="ng-table@*" data-semver="0.3.1" src="http://bazalt-cms.com/assets/ng-table/0.3.1/ng-table.js"></script>
    <script data-require="ng-table-export@0.1.0" data-semver="0.1.0" src="http://bazalt-cms.com/assets/ng-table-export/0.1.0/ng-table-export.js"></script>

<script type="text/javascript">
// Initialize the widget when the DOM is ready
$(function() {
    // Setup html5 version
    $("#uploader").pluploadQueue({
        // General settings
        runtimes : 'html5,flash,silverlight,html4',
        url : "<c:url value="/file/upload"/>",
        multi_selection:false,
        chunk_size : '20mb',
        rename : true,
        dragdrop: true,
         
        filters : {
            // Maximum file size
            max_file_size : '20mb'
            // Specify what files to browse for
           
        },
 
        // Resize images on clientside if we can
        resize: {
            width : 200,
            height : 200,
            quality : 90,
            crop: true // crop to exact dimensions
        },
 
 
        // Flash settings
        flash_swf_url : '/plupload/js/Moxie.swf',
     
        // Silverlight settings
        silverlight_xap_url : '/plupload/js/Moxie.xap'
    });
});
</script>

    <script>
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });
    </script>
    
    
    <script src="http://vast-engineering.github.io/jquery-popup-overlay/jquery.popupoverlay.js"></script>

  <script>
    $(document).ready(function() {

      // Initialize the plugin
      $('#my_popup').popup();

    });
  </script>
