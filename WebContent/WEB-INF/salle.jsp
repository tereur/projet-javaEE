<%@ include file="link1.jsp" %>
<style>
    form{
    margin-top:1%;
    padding-left:3%;
    
    }
    .info {
font-style: italic;
color: #E8A22B;
} 
</style>

   <!-- Section: inner-header -->
    <section class="inner-header divider parallax layer-overlay overlay-dark-5" data-bg-img="images/bg/resultats.jpg">
      <div class="container pt-70 pb-20">
        <!-- Section Content -->
        <div class="section-content">
          <div class="row">
            <div class="col-md-12">
              <h2 class="title text-white">Salle</h2>
              <ol class="breadcrumb text-left text-black mt-10">
                <li><a href="#">Salle</a></li>
                <li><a href="#">Nouveau</a></li>
              </ol>
            </div>
          </div>
        </div>
      </div>
    </section>
    <form method="post">
    <p class="info">${ message }</p>
         <div class="form-groupe">
            <div class="form-row">
              <label class="col-md-3" for="amphi">nom de l'amphi</label>
                 <div class="col-md-9">
                   <input id="amphi" type="text" request="" class="form-control" name="nom" placeholder="entre la ou les salle(s)">  
                 </div>
            </div>
         </div>
         <div class="form-group">
            <div class="row">
              <label class="col-md-3" for="capacite">nombres de place assise</label>
                 <div class="col-md-9">
                   <input id="capacite" type="number" min=30 class="form-control"  name="capacite" placeholder="entrer la capacite de la salle">
                 </div>
             </div>
         </div>
         <div class="form-group">
             <div classs="row">
                 <div class="col-md-1 offset-md-11">
                    <button class="btn btn-warning">Envoyer</button>
                 </div>
             </div>
         </div>
      </form>  
              
           
<%@ include file="footer1.jsp" %>
                            