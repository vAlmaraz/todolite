
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
object tags extends BaseScalaTemplate[play.api.templates.TxtFormat.Appendable,Format[play.api.templates.TxtFormat.Appendable]](play.api.templates.TxtFormat) with play.api.templates.Template1[List[String],play.api.templates.TxtFormat.Appendable] {

    /**/
    def apply/*1.2*/(tags:List[String]):play.api.templates.TxtFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.21*/("""
[
	"""),_display_(Seq[Any](/*3.3*/for(i <- tags.indices) yield /*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
		"""),_display_(Seq[Any](/*4.4*/_tag(tags(i)))),format.raw/*4.17*/("""
		"""),_display_(Seq[Any](/*5.4*/if(i < tags.size - 1)/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""
			,
		""")))})),format.raw/*7.4*/("""
	""")))})),format.raw/*8.3*/("""
]"""))}
    }
    
    def render(tags:List[String]): play.api.templates.TxtFormat.Appendable = apply(tags)
    
    def f:((List[String]) => play.api.templates.TxtFormat.Appendable) = (tags) => apply(tags)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 26 18:56:25 CET 2013
                    SOURCE: C:/play/workspace/tareas/app/views/tags.scala.txt
                    HASH: bd6643e9a33694891a06210eafe2208af1287681
                    MATRIX: 773->1|885->20|926->27|963->49|1002->51|1041->56|1075->69|1114->74|1143->95|1182->97|1223->108|1257->112
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|33->5|33->5|33->5|35->7|36->8
                    -- GENERATED --
                */
            