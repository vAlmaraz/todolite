
package views.txt

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.txt._
/**/
object _tag extends BaseScalaTemplate[play.api.templates.TxtFormat.Appendable,Format[play.api.templates.TxtFormat.Appendable]](play.api.templates.TxtFormat) with play.api.templates.Template1[Tag,play.api.templates.TxtFormat.Appendable] {

    /**/
    def apply/*1.2*/(tag: Tag):play.api.templates.TxtFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.12*/("""
"""),format.raw/*2.1*/("""{"""),format.raw/*2.2*/("""
	"""),_display_(Seq[Any](/*3.3*/if(tag != null)/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
		"id": """"),_display_(Seq[Any](/*4.11*/tag/*4.14*/.id)),format.raw/*4.17*/("""",
		"tag": """"),_display_(Seq[Any](/*5.12*/tag/*5.15*/.tag)),format.raw/*5.19*/(""""
	""")))})),format.raw/*6.3*/("""
"""),format.raw/*7.1*/("""}"""))}
    }
    
    def render(tag:Tag): play.api.templates.TxtFormat.Appendable = apply(tag)
    
    def f:((Tag) => play.api.templates.TxtFormat.Appendable) = (tag) => apply(tag)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 28 20:34:28 CET 2013
                    SOURCE: C:/play/workspace/tareas/app/views/_tag.scala.txt
                    HASH: 006740e79c45ae5946659ac3e48f2e69c56d6e76
                    MATRIX: 764->1|867->11|895->13|922->14|960->18|983->33|1022->35|1069->47|1080->50|1104->53|1154->68|1165->71|1190->75|1225->80|1253->82
                    LINES: 26->1|29->1|30->2|30->2|31->3|31->3|31->3|32->4|32->4|32->4|33->5|33->5|33->5|34->6|35->7
                    -- GENERATED --
                */
            