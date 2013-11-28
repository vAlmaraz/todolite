// @SOURCE:C:/play/workspace/tareas/conf/routes
// @HASH:3da9b12f4596880f16e81bf70fe93690d4da6b48
// @DATE:Wed Nov 27 19:05:42 CET 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:8
private[this] lazy val controllers_Usuarios_create1 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario"))))
        

// @LINE:9
private[this] lazy val controllers_Usuarios_retrieve2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"),DynamicPart("id", """[0-9]*""",false))))
        

// @LINE:10
private[this] lazy val controllers_Usuarios_retrieveByName3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"),DynamicPart("nombre", """[a-z,0-9]*""",false))))
        

// @LINE:11
private[this] lazy val controllers_Usuarios_retrieveNames4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"),DynamicPart("nombre", """[a-z,0-9]*""",false),StaticPart("/"),DynamicPart("pagina", """[0-9]*""",false))))
        

// @LINE:12
private[this] lazy val controllers_Usuarios_update5 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"),DynamicPart("id", """[0-9]*""",false))))
        

// @LINE:13
private[this] lazy val controllers_Usuarios_delete6 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"),DynamicPart("id", """[0-9]*""",false))))
        

// @LINE:15
private[this] lazy val controllers_Usuarios_index7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuarios/"),DynamicPart("pagina", """[0-9]*""",false))))
        

// @LINE:17
private[this] lazy val controllers_Tareas_create8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"),DynamicPart("id", """[0-9]*""",false),StaticPart("/tarea"))))
        

// @LINE:18
private[this] lazy val controllers_Tareas_retrieve9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"),DynamicPart("id", """[0-9]*""",false),StaticPart("/tarea/"),DynamicPart("tarea", """[0-9]*""",false))))
        

// @LINE:19
private[this] lazy val controllers_Tareas_update10 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"),DynamicPart("id", """[0-9]*""",false),StaticPart("/tarea/"),DynamicPart("tarea", """[0-9]*""",false))))
        

// @LINE:20
private[this] lazy val controllers_Tareas_done11 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"),DynamicPart("id", """[0-9]*""",false),StaticPart("/tarea/"),DynamicPart("tarea", """[0-9]*""",false),StaticPart("/realizada"))))
        

// @LINE:21
private[this] lazy val controllers_Tareas_delete12 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"),DynamicPart("id", """[0-9]*""",false),StaticPart("/tarea/"),DynamicPart("tarea", """[0-9]*""",false))))
        

// @LINE:23
private[this] lazy val controllers_Tareas_index13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"),DynamicPart("id", """[0-9]*""",false),StaticPart("/tareas/"),DynamicPart("pagina", """[0-9]*""",false))))
        

// @LINE:25
private[this] lazy val controllers_Tags_create14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag"))))
        

// @LINE:26
private[this] lazy val controllers_Tags_retrieve15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag/"),DynamicPart("id", """[0-9]*""",false))))
        

// @LINE:27
private[this] lazy val controllers_Tags_update16 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag/"),DynamicPart("id", """[0-9]*""",false))))
        

// @LINE:28
private[this] lazy val controllers_Tags_delete17 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag/"),DynamicPart("id", """[0-9]*""",false))))
        

// @LINE:30
private[this] lazy val controllers_Tareas_addTags18 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"),DynamicPart("id", """[0-9]*""",false),StaticPart("/tarea/"),DynamicPart("tarea", """[0-9]*""",false),StaticPart("/tags"))))
        

// @LINE:31
private[this] lazy val controllers_Tareas_getTags19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"),DynamicPart("id", """[0-9]*""",false),StaticPart("/tarea/"),DynamicPart("tarea", """[0-9]*""",false),StaticPart("/tags/"),DynamicPart("pagina", """[0-9]*""",false))))
        

// @LINE:33
private[this] lazy val controllers_Tareas_tareasByTagName20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"),DynamicPart("id", """[0-9]*""",false),StaticPart("/tag/"),DynamicPart("tag", """[a-z,0-9]*""",false))))
        

// @LINE:37
private[this] lazy val controllers_Assets_at21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario""","""controllers.Usuarios.create()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/$id<[0-9]*>""","""controllers.Usuarios.retrieve(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/$nombre<[a-z,0-9]*>""","""controllers.Usuarios.retrieveByName(nombre:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/$nombre<[a-z,0-9]*>/$pagina<[0-9]*>""","""controllers.Usuarios.retrieveNames(nombre:String, pagina:Integer)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/$id<[0-9]*>""","""controllers.Usuarios.update(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/$id<[0-9]*>""","""controllers.Usuarios.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuarios/$pagina<[0-9]*>""","""controllers.Usuarios.index(pagina:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/$id<[0-9]*>/tarea""","""controllers.Tareas.create(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/$id<[0-9]*>/tarea/$tarea<[0-9]*>""","""controllers.Tareas.retrieve(id:Long, tarea:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/$id<[0-9]*>/tarea/$tarea<[0-9]*>""","""controllers.Tareas.update(id:Long, tarea:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/$id<[0-9]*>/tarea/$tarea<[0-9]*>/realizada""","""controllers.Tareas.done(id:Long, tarea:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/$id<[0-9]*>/tarea/$tarea<[0-9]*>""","""controllers.Tareas.delete(id:Long, tarea:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/$id<[0-9]*>/tareas/$pagina<[0-9]*>""","""controllers.Tareas.index(id:Long, pagina:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag""","""controllers.Tags.create()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag/$id<[0-9]*>""","""controllers.Tags.retrieve(id:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag/$id<[0-9]*>""","""controllers.Tags.update(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag/$id<[0-9]*>""","""controllers.Tags.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/$id<[0-9]*>/tarea/$tarea<[0-9]*>/tags""","""controllers.Tareas.addTags(id:Long, tarea:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/$id<[0-9]*>/tarea/$tarea<[0-9]*>/tags/$pagina<[0-9]*>""","""controllers.Tareas.getTags(id:Long, tarea:Long, pagina:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/$id<[0-9]*>/tag/$tag<[a-z,0-9]*>""","""controllers.Tareas.tareasByTagName(id:Long, tag:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:8
case controllers_Usuarios_create1(params) => {
   call { 
        invokeHandler(controllers.Usuarios.create(), HandlerDef(this, "controllers.Usuarios", "create", Nil,"POST", """""", Routes.prefix + """usuario"""))
   }
}
        

// @LINE:9
case controllers_Usuarios_retrieve2(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Usuarios.retrieve(id), HandlerDef(this, "controllers.Usuarios", "retrieve", Seq(classOf[Long]),"GET", """""", Routes.prefix + """usuario/$id<[0-9]*>"""))
   }
}
        

// @LINE:10
case controllers_Usuarios_retrieveByName3(params) => {
   call(params.fromPath[String]("nombre", None)) { (nombre) =>
        invokeHandler(controllers.Usuarios.retrieveByName(nombre), HandlerDef(this, "controllers.Usuarios", "retrieveByName", Seq(classOf[String]),"GET", """""", Routes.prefix + """usuario/$nombre<[a-z,0-9]*>"""))
   }
}
        

// @LINE:11
case controllers_Usuarios_retrieveNames4(params) => {
   call(params.fromPath[String]("nombre", None), params.fromPath[Integer]("pagina", None)) { (nombre, pagina) =>
        invokeHandler(controllers.Usuarios.retrieveNames(nombre, pagina), HandlerDef(this, "controllers.Usuarios", "retrieveNames", Seq(classOf[String], classOf[Integer]),"GET", """""", Routes.prefix + """usuario/$nombre<[a-z,0-9]*>/$pagina<[0-9]*>"""))
   }
}
        

// @LINE:12
case controllers_Usuarios_update5(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Usuarios.update(id), HandlerDef(this, "controllers.Usuarios", "update", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """usuario/$id<[0-9]*>"""))
   }
}
        

// @LINE:13
case controllers_Usuarios_delete6(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Usuarios.delete(id), HandlerDef(this, "controllers.Usuarios", "delete", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """usuario/$id<[0-9]*>"""))
   }
}
        

// @LINE:15
case controllers_Usuarios_index7(params) => {
   call(params.fromPath[Integer]("pagina", None)) { (pagina) =>
        invokeHandler(controllers.Usuarios.index(pagina), HandlerDef(this, "controllers.Usuarios", "index", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """usuarios/$pagina<[0-9]*>"""))
   }
}
        

// @LINE:17
case controllers_Tareas_create8(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Tareas.create(id), HandlerDef(this, "controllers.Tareas", "create", Seq(classOf[Long]),"POST", """""", Routes.prefix + """usuario/$id<[0-9]*>/tarea"""))
   }
}
        

// @LINE:18
case controllers_Tareas_retrieve9(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[Long]("tarea", None)) { (id, tarea) =>
        invokeHandler(controllers.Tareas.retrieve(id, tarea), HandlerDef(this, "controllers.Tareas", "retrieve", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """usuario/$id<[0-9]*>/tarea/$tarea<[0-9]*>"""))
   }
}
        

// @LINE:19
case controllers_Tareas_update10(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[Long]("tarea", None)) { (id, tarea) =>
        invokeHandler(controllers.Tareas.update(id, tarea), HandlerDef(this, "controllers.Tareas", "update", Seq(classOf[Long], classOf[Long]),"PUT", """""", Routes.prefix + """usuario/$id<[0-9]*>/tarea/$tarea<[0-9]*>"""))
   }
}
        

// @LINE:20
case controllers_Tareas_done11(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[Long]("tarea", None)) { (id, tarea) =>
        invokeHandler(controllers.Tareas.done(id, tarea), HandlerDef(this, "controllers.Tareas", "done", Seq(classOf[Long], classOf[Long]),"PUT", """""", Routes.prefix + """usuario/$id<[0-9]*>/tarea/$tarea<[0-9]*>/realizada"""))
   }
}
        

// @LINE:21
case controllers_Tareas_delete12(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[Long]("tarea", None)) { (id, tarea) =>
        invokeHandler(controllers.Tareas.delete(id, tarea), HandlerDef(this, "controllers.Tareas", "delete", Seq(classOf[Long], classOf[Long]),"DELETE", """""", Routes.prefix + """usuario/$id<[0-9]*>/tarea/$tarea<[0-9]*>"""))
   }
}
        

// @LINE:23
case controllers_Tareas_index13(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[Integer]("pagina", None)) { (id, pagina) =>
        invokeHandler(controllers.Tareas.index(id, pagina), HandlerDef(this, "controllers.Tareas", "index", Seq(classOf[Long], classOf[Integer]),"GET", """""", Routes.prefix + """usuario/$id<[0-9]*>/tareas/$pagina<[0-9]*>"""))
   }
}
        

// @LINE:25
case controllers_Tags_create14(params) => {
   call { 
        invokeHandler(controllers.Tags.create(), HandlerDef(this, "controllers.Tags", "create", Nil,"POST", """""", Routes.prefix + """tag"""))
   }
}
        

// @LINE:26
case controllers_Tags_retrieve15(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Tags.retrieve(id), HandlerDef(this, "controllers.Tags", "retrieve", Seq(classOf[Long]),"GET", """""", Routes.prefix + """tag/$id<[0-9]*>"""))
   }
}
        

// @LINE:27
case controllers_Tags_update16(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Tags.update(id), HandlerDef(this, "controllers.Tags", "update", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """tag/$id<[0-9]*>"""))
   }
}
        

// @LINE:28
case controllers_Tags_delete17(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Tags.delete(id), HandlerDef(this, "controllers.Tags", "delete", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """tag/$id<[0-9]*>"""))
   }
}
        

// @LINE:30
case controllers_Tareas_addTags18(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[Long]("tarea", None)) { (id, tarea) =>
        invokeHandler(controllers.Tareas.addTags(id, tarea), HandlerDef(this, "controllers.Tareas", "addTags", Seq(classOf[Long], classOf[Long]),"POST", """""", Routes.prefix + """usuario/$id<[0-9]*>/tarea/$tarea<[0-9]*>/tags"""))
   }
}
        

// @LINE:31
case controllers_Tareas_getTags19(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[Long]("tarea", None), params.fromPath[Integer]("pagina", None)) { (id, tarea, pagina) =>
        invokeHandler(controllers.Tareas.getTags(id, tarea, pagina), HandlerDef(this, "controllers.Tareas", "getTags", Seq(classOf[Long], classOf[Long], classOf[Integer]),"GET", """""", Routes.prefix + """usuario/$id<[0-9]*>/tarea/$tarea<[0-9]*>/tags/$pagina<[0-9]*>"""))
   }
}
        

// @LINE:33
case controllers_Tareas_tareasByTagName20(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[String]("tag", None)) { (id, tag) =>
        invokeHandler(controllers.Tareas.tareasByTagName(id, tag), HandlerDef(this, "controllers.Tareas", "tareasByTagName", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """usuario/$id<[0-9]*>/tag/$tag<[a-z,0-9]*>"""))
   }
}
        

// @LINE:37
case controllers_Assets_at21(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     