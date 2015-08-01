<div id="page-content-wrapper">
 <div class="container-fluid">
           <div class="row">
              <div class="col-lg-2"></div>
                    <div class="col-lg-10">          

        <a href="#menu-toggle" class="btn btn-default" id="menu-toggle">
          <span class="glyphicon glyphicon-move" aria-hidden="true"></span></a>


<div ng-app="myapp1">
    <div ng-controller=dashboardCtrl>
    
     <div class="row">
    <div class=".col-md-4">
      <nvd3 options="optionspie" data="fileTypeSizeData"></nvd3>
    </div>
     <div class=".col-md-4">
    <nvd3 options="optionsDonut" data="fileTypeCountData"></nvd3>
    </div>
      
      <div class=".col-md-4">
    <nvd3 options="optionspie" data="discreteBarchartData"></nvd3>
    </div>
    
      <div class=".col-md-4">
    <nvd3 options="optionsDonut" data="discreteBarchartData"></nvd3>
    </div>
        
        </div>
        
        <!--   <div class="row">
          <nvd3 options="discreteBarchartoptions" data="discreteBarchartData"></nvd3>
        </div>  -->
       
    </div>
</div>

</div>
</div>
</div></div>