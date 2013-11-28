// @SOURCE:C:/play/workspace/tareas/conf/routes
// @HASH:ddf4ae1db5dfad2ad0d1e15a71d5eb2fe8676c12
// @DATE:Thu Nov 28 20:38:52 CET 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:39
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers {

// @LINE:39
class ReverseAssets {
    

// @LINE:39
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
class ReverseTareas {
    

// @LINE:35
def tareasByTagName(id:Long, tag:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("id", id) + "/tag/" + implicitly[PathBindable[String]].unbind("tag", tag))
}
                                                

// @LINE:19
def update(id:Long, tarea:Long): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("id", id) + "/tarea/" + implicitly[PathBindable[Long]].unbind("tarea", tarea))
}
                                                

// @LINE:20
def done(id:Long, tarea:Long): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("id", id) + "/tarea/" + implicitly[PathBindable[Long]].unbind("tarea", tarea) + "/realizada")
}
                                                

// @LINE:23
def index(id:Long, pagina:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("id", id) + "/tareas/" + implicitly[PathBindable[Integer]].unbind("pagina", pagina))
}
                                                

// @LINE:33
def getTags(id:Long, tarea:Long, pagina:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("id", id) + "/tarea/" + implicitly[PathBindable[Long]].unbind("tarea", tarea) + "/tags/" + implicitly[PathBindable[Integer]].unbind("pagina", pagina))
}
                                                

// @LINE:32
def addTags(id:Long, tarea:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("id", id) + "/tarea/" + implicitly[PathBindable[Long]].unbind("tarea", tarea) + "/tags")
}
                                                

// @LINE:21
def delete(id:Long, tarea:Long): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("id", id) + "/tarea/" + implicitly[PathBindable[Long]].unbind("tarea", tarea))
}
                                                

// @LINE:18
def retrieve(id:Long, tarea:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("id", id) + "/tarea/" + implicitly[PathBindable[Long]].unbind("tarea", tarea))
}
                                                

// @LINE:17
def create(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("id", id) + "/tarea")
}
                                                
    
}
                          

// @LINE:30
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
class ReverseTags {
    

// @LINE:30
def index(pagina:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "tags/" + implicitly[PathBindable[Integer]].unbind("pagina", pagina))
}
                                                

// @LINE:28
def delete(id:Long): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "tag/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:26
def retrieve(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "tag/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:25
def create(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "tag")
}
                                                

// @LINE:27
def update(id:Long): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "tag/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
class ReverseUsuarios {
    

// @LINE:15
def index(pagina:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Integer]].unbind("pagina", pagina))
}
                                                

// @LINE:13
def delete(id:Long): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:9
def retrieve(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:8
def create(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "usuario")
}
                                                

// @LINE:11
def retrieveNames(nombre:String, pagina:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[String]].unbind("nombre", nombre) + "/" + implicitly[PathBindable[Integer]].unbind("pagina", pagina))
}
                                                

// @LINE:12
def update(id:Long): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:10
def retrieveByName(nombre:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[String]].unbind("nombre", nombre))
}
                                                
    
}
                          
}
                  


// @LINE:39
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.javascript {

// @LINE:39
class ReverseAssets {
    

// @LINE:39
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
class ReverseTareas {
    

// @LINE:35
def tareasByTagName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tareas.tareasByTagName",
   """
      function(id,tag) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/tag/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("tag", tag)})
      }
   """
)
                        

// @LINE:19
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tareas.update",
   """
      function(id,tarea) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/tarea/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("tarea", tarea)})
      }
   """
)
                        

// @LINE:20
def done : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tareas.done",
   """
      function(id,tarea) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/tarea/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("tarea", tarea) + "/realizada"})
      }
   """
)
                        

// @LINE:23
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tareas.index",
   """
      function(id,pagina) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/tareas/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pagina", pagina)})
      }
   """
)
                        

// @LINE:33
def getTags : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tareas.getTags",
   """
      function(id,tarea,pagina) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/tarea/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("tarea", tarea) + "/tags/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pagina", pagina)})
      }
   """
)
                        

// @LINE:32
def addTags : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tareas.addTags",
   """
      function(id,tarea) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/tarea/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("tarea", tarea) + "/tags"})
      }
   """
)
                        

// @LINE:21
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tareas.delete",
   """
      function(id,tarea) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/tarea/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("tarea", tarea)})
      }
   """
)
                        

// @LINE:18
def retrieve : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tareas.retrieve",
   """
      function(id,tarea) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/tarea/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("tarea", tarea)})
      }
   """
)
                        

// @LINE:17
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tareas.create",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/tarea"})
      }
   """
)
                        
    
}
              

// @LINE:30
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
class ReverseTags {
    

// @LINE:30
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tags.index",
   """
      function(pagina) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tags/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pagina", pagina)})
      }
   """
)
                        

// @LINE:28
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tags.delete",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "tag/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:26
def retrieve : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tags.retrieve",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tag/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:25
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tags.create",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tag"})
      }
   """
)
                        

// @LINE:27
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tags.update",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "tag/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
class ReverseUsuarios {
    

// @LINE:15
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Usuarios.index",
   """
      function(pagina) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pagina", pagina)})
      }
   """
)
                        

// @LINE:13
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Usuarios.delete",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:9
def retrieve : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Usuarios.retrieve",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:8
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Usuarios.create",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario"})
      }
   """
)
                        

// @LINE:11
def retrieveNames : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Usuarios.retrieveNames",
   """
      function(nombre,pagina) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("nombre", nombre) + "/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pagina", pagina)})
      }
   """
)
                        

// @LINE:12
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Usuarios.update",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:10
def retrieveByName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Usuarios.retrieveByName",
   """
      function(nombre) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("nombre", nombre)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:39
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:39
class ReverseAssets {
    

// @LINE:39
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          

// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
class ReverseTareas {
    

// @LINE:35
def tareasByTagName(id:Long, tag:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tareas.tareasByTagName(id, tag), HandlerDef(this, "controllers.Tareas", "tareasByTagName", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """usuario/$id<[0-9]*>/tag/$tag<[a-z,0-9]*>""")
)
                      

// @LINE:19
def update(id:Long, tarea:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tareas.update(id, tarea), HandlerDef(this, "controllers.Tareas", "update", Seq(classOf[Long], classOf[Long]), "PUT", """""", _prefix + """usuario/$id<[0-9]*>/tarea/$tarea<[0-9]*>""")
)
                      

// @LINE:20
def done(id:Long, tarea:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tareas.done(id, tarea), HandlerDef(this, "controllers.Tareas", "done", Seq(classOf[Long], classOf[Long]), "PUT", """""", _prefix + """usuario/$id<[0-9]*>/tarea/$tarea<[0-9]*>/realizada""")
)
                      

// @LINE:23
def index(id:Long, pagina:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tareas.index(id, pagina), HandlerDef(this, "controllers.Tareas", "index", Seq(classOf[Long], classOf[Integer]), "GET", """""", _prefix + """usuario/$id<[0-9]*>/tareas/$pagina<[0-9]*>""")
)
                      

// @LINE:33
def getTags(id:Long, tarea:Long, pagina:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tareas.getTags(id, tarea, pagina), HandlerDef(this, "controllers.Tareas", "getTags", Seq(classOf[Long], classOf[Long], classOf[Integer]), "GET", """""", _prefix + """usuario/$id<[0-9]*>/tarea/$tarea<[0-9]*>/tags/$pagina<[0-9]*>""")
)
                      

// @LINE:32
def addTags(id:Long, tarea:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tareas.addTags(id, tarea), HandlerDef(this, "controllers.Tareas", "addTags", Seq(classOf[Long], classOf[Long]), "POST", """""", _prefix + """usuario/$id<[0-9]*>/tarea/$tarea<[0-9]*>/tags""")
)
                      

// @LINE:21
def delete(id:Long, tarea:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tareas.delete(id, tarea), HandlerDef(this, "controllers.Tareas", "delete", Seq(classOf[Long], classOf[Long]), "DELETE", """""", _prefix + """usuario/$id<[0-9]*>/tarea/$tarea<[0-9]*>""")
)
                      

// @LINE:18
def retrieve(id:Long, tarea:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tareas.retrieve(id, tarea), HandlerDef(this, "controllers.Tareas", "retrieve", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """usuario/$id<[0-9]*>/tarea/$tarea<[0-9]*>""")
)
                      

// @LINE:17
def create(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tareas.create(id), HandlerDef(this, "controllers.Tareas", "create", Seq(classOf[Long]), "POST", """""", _prefix + """usuario/$id<[0-9]*>/tarea""")
)
                      
    
}
                          

// @LINE:30
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
class ReverseTags {
    

// @LINE:30
def index(pagina:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tags.index(pagina), HandlerDef(this, "controllers.Tags", "index", Seq(classOf[Integer]), "GET", """""", _prefix + """tags/$pagina<[0-9]*>""")
)
                      

// @LINE:28
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tags.delete(id), HandlerDef(this, "controllers.Tags", "delete", Seq(classOf[Long]), "DELETE", """""", _prefix + """tag/$id<[0-9]*>""")
)
                      

// @LINE:26
def retrieve(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tags.retrieve(id), HandlerDef(this, "controllers.Tags", "retrieve", Seq(classOf[Long]), "GET", """""", _prefix + """tag/$id<[0-9]*>""")
)
                      

// @LINE:25
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tags.create(), HandlerDef(this, "controllers.Tags", "create", Seq(), "POST", """""", _prefix + """tag""")
)
                      

// @LINE:27
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tags.update(id), HandlerDef(this, "controllers.Tags", "update", Seq(classOf[Long]), "PUT", """""", _prefix + """tag/$id<[0-9]*>""")
)
                      
    
}
                          

// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
class ReverseUsuarios {
    

// @LINE:15
def index(pagina:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Usuarios.index(pagina), HandlerDef(this, "controllers.Usuarios", "index", Seq(classOf[Integer]), "GET", """""", _prefix + """usuarios/$pagina<[0-9]*>""")
)
                      

// @LINE:13
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Usuarios.delete(id), HandlerDef(this, "controllers.Usuarios", "delete", Seq(classOf[Long]), "DELETE", """""", _prefix + """usuario/$id<[0-9]*>""")
)
                      

// @LINE:9
def retrieve(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Usuarios.retrieve(id), HandlerDef(this, "controllers.Usuarios", "retrieve", Seq(classOf[Long]), "GET", """""", _prefix + """usuario/$id<[0-9]*>""")
)
                      

// @LINE:8
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Usuarios.create(), HandlerDef(this, "controllers.Usuarios", "create", Seq(), "POST", """""", _prefix + """usuario""")
)
                      

// @LINE:11
def retrieveNames(nombre:String, pagina:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Usuarios.retrieveNames(nombre, pagina), HandlerDef(this, "controllers.Usuarios", "retrieveNames", Seq(classOf[String], classOf[Integer]), "GET", """""", _prefix + """usuario/$nombre<[a-z,0-9]*>/$pagina<[0-9]*>""")
)
                      

// @LINE:12
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Usuarios.update(id), HandlerDef(this, "controllers.Usuarios", "update", Seq(classOf[Long]), "PUT", """""", _prefix + """usuario/$id<[0-9]*>""")
)
                      

// @LINE:10
def retrieveByName(nombre:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Usuarios.retrieveByName(nombre), HandlerDef(this, "controllers.Usuarios", "retrieveByName", Seq(classOf[String]), "GET", """""", _prefix + """usuario/$nombre<[a-z,0-9]*>""")
)
                      
    
}
                          
}
        
    