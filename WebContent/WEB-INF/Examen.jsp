<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="link1.jsp" %>
<style>
/* menu de navigation repartition*/
.icon{
display:none;
}        
.ferme{
display:none;
}        
.rep_suiv{
    	
    width: 18%;
   width: 260px;
  position: absolute;
  top: 10;
  left: 0;
  height: 81%;
  background-image: url("images/2.PNG");
  z-index: 101;
  padding-left: 3%;
  padding-top: 1%;
  -webkit-transition: none;
  -o-transition: none;
  transition: none;
       } 
 .rep_suiv ul li{
 margin-bottom:-5%;	

 }
 .rep_content{
margin-top:1%;
margin-bottom:1%;
  margin-left: 20%;
 height:550px;
 
  padding: 3%;
 
 }
.rep_suiv_active{

}
@media only screen and (max-width : 991px) {
.rep_suiv{
    
display:none;    	
 width: 150px;
  position: absolute;
  top: 10;
  left: 0;
  height: auto;
  
  z-index: 101;
 padding-left:0;
  padding-top: 0%;
  -webkit-transition: none;
  -o-transition: none;
  transition: none;
  background:cover;
       }
.icon{
display:block;
}        
 .rep_suiv ul li{
 margin-bottom:-10%;	

 }
.rep_suiv ul menuzord-menu{
background-color:none;
width: 15px;
left:0;
}
  .rep_content{
margin-top:1%;
margin-bottom:1%;
  margin-left: 5%;
 height:auto;
 
  padding: 3%;
 
 }
 
}
</style>
    <div class="header-nav">
      <div class="header-nav-wrapper navbar-scrolltofixed bg-lightest">
        <div class="container">
          <nav id="menuzord-right" class="menuzord orange">
            <a class="menuzord-brand pull-left flip mt-15" href="javascript:void(0)">
              <img src="images/Untitled-2.png" alt="">
            </a>
            <ul class="menuzord-menu dark">
              <li ><a href="home_admins">Home</a> </li>
              <li class="active"><a href="#">Examen <span class="label label-info">New</span></a>
              <ul class="dropdown">
                  <li><a href="#">Nouveau</a>
                   <ul class="dropdown">
                      <li><a href="Examens?examen=normal">Session normale</a></li>
                      <li><a href="Examens?examen=rattrapage">Session Rattrapage</a></li>
                    </ul>
                  </li>
                  <li><a href="#">Modifier</a> 
                  <ul class="dropdown">
                     <li><a href="#">Session normale</a></li>
                      <li><a href="#">Session Rattrapage</a></li>
                    </ul>
                  </li>
                  <li><a href="#">Supprimer</a>
                   <ul class="dropdown">
                    <li><a href="#">Session normale</a></li>
                      <li><a href="#">Session Rattrapage</a></li>
                    </ul>
                  </li>
                </ul>
              </li>
                 
              <li><a href="page_404">Courses</a>
                
              <li><a href="page_404">Room <span class="label label-info">New</span></a> </li>

              <li><a href="#h">Teachers</a></li>
            
              <li ><a href="page_contact">Contact</a></li>
            </ul>
          </nav>
        </div>
      </div>
    </div>
  </header>
  <c:set var="examen" value="${examen}" scope="application"/> 
  <c:set var="fac" value="${fac}" scope="application"/>
   <c:set var="heure" value="${heure}" scope="application"/>
   <c:set var="Nbs" value="${Nbs}" scope="application"/>
   <!-- Section: inner-header -->
    <section class="inner-header divider parallax layer-overlay overlay-dark-5" data-bg-img="images/bg/resultats.jpg">
      <div class="container pt-70 pb-20">
        <!-- Section Content -->
        <div class="section-content">
          <div class="row">
            <div class="col-md-12">
              <h2 class="title text-white">Examen</h2>
              <ol class="breadcrumb text-left text-black mt-10">
                <li><a href="#">Examen</a></li>
                <li><a href="#">Nouveau</a></li>
              </ol>
            </div>
          </div>
        </div>
      </div>
    </section>
    <div class="rep_suiv">
         <ul class="menuzord-menu ">
         <c:choose>
        <c:when test="${etape=='1' }"> 
              <li class="active"><a >Choix de la faculte</a></li> 
              </c:when>
              <c:when test="${etape!='1' }"> 
              <li ><a >Choix de la faculte</a></li> 
              </c:when>
         </c:choose>
              <c:choose>
        <c:when test="${etape=='2' }"> 
              <li class="active"><a >Heure d examen</a></li> 
              </c:when>
              <c:when test="${etape!='2' }"> 
              <li ><a >Heure d examen</a></li> 
              </c:when>
         </c:choose>
          <c:choose>
        <c:when test="${etape=='3' }"> 
              <li class="active"><a >Nombres de Salles</a></li> 
              </c:when>
              <c:when test="${etape!='3' }"> 
              <li><a href="">Nombres de Salles</a></li> 
              </c:when>
         </c:choose>          
           
            <c:choose>
               <c:when test="${etape=='4' }"> 
              <li class="active"><a >Choix de salles</a></li> 
              </c:when>
              <c:when test="${etape!='4' }"> 
              <li><a href="">Choix de salles</a></li> 
              </c:when>
         </c:choose>   
           
         <c:choose>
               <c:when test="${etape=='5' }"> 
              <li class="active"><a >Nombre de filiere</a></li> 
              </c:when>
              <c:when test="${rtape!='5' }"> 
              <li><a href="">Nombre de filiere</a></li> 
              </c:when>
         </c:choose>   
              
           <c:choose>
               <c:when test="${etape=='6' }"> 
              <li class="active"><a >Choix de filiere</a></li> 
              </c:when>
              <c:when test="${etape!='6' }"> 
              <li><a href="">Choix de filiere</a></li> 
              </c:when>
         </c:choose>   
               <c:choose>
               <c:when test="${etape=='7' }"> 
              <li class="active"><a >Choix d uv</a></li> 
              </c:when>
              <c:when test="${etape!='7' }"> 
              <li><a href="">Choix d uv</a></li> 
              </c:when>
         </c:choose> 
              
                          
            </ul>
    </div>
    <div class="rep_content">
      gjgjlrghgnerlgre <br>
    jrjkggrgr<br>
    grgrgrgr<br>
    grgrgrogrg<br>
    grjgrogr<br>
    grgrngrg<br>
    <br>
    <c:if test="${etape=='1' }"> 
    <div class="info" id="fac">
   <br><br>
    <form method="get" >   
    <select  name="fac" class="form-control">
      <option >-----choix de faculte-----</option>
      <option value="FS">Faculte des Sciences</option>
      <option value="FSEG">Faculte des Sciences Economiques et de Gestion</option>
      <option value="FSJP">Faculte des Sciences Juridiques et Politiques</option>
      <option value="FMSP">Faculte de Medecine et des Sciences Pharmaceutiques</option>
      <option value="FLSH">Faculte des Lettres et des Sciences Humaines</option>
      <option value="FASA"> Faculte d'Agronomie et des Sciences Agricoles</option>
  </select>     
        <br><br>   
    <button class="">Suivant</button>    
   </form> 
    </div>
    </c:if>
    <c:if test="${etape=='2' }"> 
    <div class="heure" id="heure">
     <form method="get" > 
     <div class="form-group">
    <label for="dure">Dure d evaluation</label>
    <input type="number" class="form-control" id="dure" name="heure"placeholder="dure d evaluation">
  </div>
   <div class="form-group">
    <label for="jour">jour</label>
    <input type="date" class="form-control" id="jour" placeholder="jour de l evaluation">
  </div>
  <div class="row">
  <div class="col-xs-4"><label for="heuredeb">heure de debut</label></div>
    <div class="col-xs-3"> <input type="number" class="form-control"  placeholder="heure"></label></div>
    <div class="col-xs-4"> <input type="number" class="form-control"  placeholder="minute"></label></div>
    
  </div>
  <br>
  <div class="row">
  <div class="col-xs-4"><label for="heuredeb">heure de fin</label></div>
    <div class="col-xs-3"> <input type="number" class="form-control"  placeholder="heure"></label></div>
    <div class="col-xs-4"> <input type="number"class="form-control"   placeholder="minute"></label></div>
    
  </div>
  
         
    <button class="">Suivant</button>    
   </form> 
    </div>
    </c:if>
    <c:if test="${etape=='3' }">
    <form method="get" > 
     <div class="form-group">
    <label for="dure">Nombreux de salle </label>
    <input type="number" class="form-control" id="dure" name="nbs"placeholder="Entre le nombre de salle">
  </div>
  <button class="">Suivant</button>    
   </form> 
    </c:if>
    <c:if test="${etape=='4' }">
    <form method="get" >
    <div class="table-responsive">
  <table class="table">
 <thead> <tr> <th>choix</th>    
 <th>Table heading</th> 
 <th>Table heading</th> 
 <th>Table heading</th> </tr> 
 </thead> 
 <tbody> <tr> <th scope="row"><input type="checkbox" id="blankCheckbox" name="salle" value="option1" aria-label="..."></th> 
 <td>Table cell</td>  <td>Table cell</td> <td>Table cell</td> </tr>
  <tr> <th scope="row"><input type="checkbox" id="blankCheckbox" value="option2" aria-label="..."></th> 
   <td>Table cell</td> <td>Table cell</td> <td>Table cell</td> </tr> 
   </tbody>
  </table>
</div>
<button class="">Suivant</button>  
</form>
 </c:if>
  <c:if test="${etape=='5' }">
    <form method="get" > 
     <div class="form-group">
    <label for="dure">Nombreux de filiere </label>
    <input type="number" class="form-control" id="nbre_fil" name="nbre_fil" placeholder="entre le nombre de filiere que vous voulez evalue">
  </div>
  <button class="">Suivant</button>    
   </form> 
    </c:if>
     <c:if test="${etape=='6' }">
    <form method="get" > 
     <div class="form-group">
    <label >choix des filiere</label> 
   <div class="radio">
  <label>
    <input type="radio" name="filiere" id="blankRadio1" value="option1" aria-label="...">1
  </label>
  <label>
    <input type="radio" name="blankRadio" id="blankRadio1" value="option2" aria-label="...">1
  </label>
</div>
</div>
  <button class="">Suivant</button>    
   </form> 
    </c:if>
    <c:if test="${etape=='7' }">
    <form method="get" > 
     <div class="form-group">
    <label >choix d uv </label> 
   <div class="radio">
  <label>
    <input type="radio" name="blankRadio" id="blankRadio1" value="option1" aria-label="...">1
  </label>
  <label>
    <input type="radio" name="blankRadio" id="blankRadio1" value="option2" aria-label="...">1
  </label>
</div>
</div>
  <button class="">Suivant</button>    
   </form> 
    </c:if>
    </div>
  <!-- end main-content -->
  
<%@ include file="footer1.jsp" %>