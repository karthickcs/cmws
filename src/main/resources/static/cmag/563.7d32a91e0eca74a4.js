"use strict";(self.webpackChunkcmag=self.webpackChunkcmag||[]).push([[563],{8563:(M,u,i)=>{i.r(u),i.d(u,{CreatetaskModule:()=>T});var d=i(6895),c=i(646),e=i(1571),m=i(1137),p=i(1441),g=i(384),r=i(433),C=i(4631);const f=[{path:"",component:(()=>{class n{constructor(l,t,o,a){this.taskControllerService=l,this.fileControllerService=t,this.auth=o,this.router=a,this.taskMainDTO={}}ngOnInit(){this.taskMainDTO.createdby=2}onFileSelected2(l){this.fileControllerService.uploadFileUsingPOST(l.currentTarget.files[0]).subscribe(o=>{alert(o.fname),this.taskMainDTO.filelocation2=o.fname},o=>{console.log(o)})}onFileSelected1(l){const t=event.currentTarget.files[0];this.fileControllerService.uploadFileUsingPOST(t).subscribe(o=>{alert(o.fname),this.taskMainDTO.filelocation=o.fname},o=>{console.log(o)})}myClickFunction(l){this.taskControllerService.savetaskmainUsingPOST(this.taskMainDTO).subscribe(t=>{alert("Saved")},t=>{console.log(t)})}}return n.\u0275fac=function(l){return new(l||n)(e.Y36(m.Y),e.Y36(p.k),e.Y36(g.e),e.Y36(c.F0))},n.\u0275cmp=e.Xpm({type:n,selectors:[["app-createtask"]],decls:32,vars:5,consts:[[1,"row"],[1,"col-sm-12"],["cardTitle","Create Task",3,"options"],[1,"col-md-6"],["action","javascript:"],[1,"form-group"],["type","text","name","taskname","placeholder","Enter Taskname",1,"form-control",3,"ngModel","ngModelChange"],["type","text","name","filelocation","placeholder","Browse filelocation","readonly","",1,"form-control",3,"ngModel","ngModelChange"],[1,"input-group","mb-3"],[1,"custom-file"],["type","file","id","inputGroupFile01",1,"custom-file-input",3,"change"],["type","text","name","filelocation2","placeholder","Browse filelocation2","readonly","",1,"form-control",3,"ngModel","ngModelChange"],["type","file","id","inputGroupFile02",1,"custom-file-input",3,"change"],["type","number","name","rowcount","placeholder","Enter Row count",1,"form-control",3,"ngModel","ngModelChange"],["type","button",1,"btn","btn-primary",3,"click"]],template:function(l,t){1&l&&(e.TgZ(0,"div",0)(1,"div",1)(2,"app-card",2)(3,"div",0)(4,"div",3)(5,"form",4)(6,"div",5)(7,"label"),e._uU(8,"Task Name"),e.qZA(),e.TgZ(9,"input",6),e.NdJ("ngModelChange",function(a){return t.taskMainDTO.taskname=a}),e.qZA()(),e.TgZ(10,"div",5)(11,"label"),e._uU(12,"File location system1"),e.qZA(),e.TgZ(13,"input",7),e.NdJ("ngModelChange",function(a){return t.taskMainDTO.filelocation=a}),e.qZA()(),e.TgZ(14,"div",8)(15,"div",9)(16,"input",10),e.NdJ("change",function(a){return t.onFileSelected1(a)}),e.qZA()()(),e.TgZ(17,"div",5)(18,"label"),e._uU(19,"File location system2"),e.qZA(),e.TgZ(20,"input",11),e.NdJ("ngModelChange",function(a){return t.taskMainDTO.filelocation2=a}),e.qZA()(),e.TgZ(21,"div",8)(22,"div",9)(23,"input",12),e.NdJ("change",function(a){return t.onFileSelected2(a)}),e.qZA()()(),e.TgZ(24,"div",5)(25,"label"),e._uU(26,"Row count"),e.qZA(),e.TgZ(27,"input",13),e.NdJ("ngModelChange",function(a){return t.taskMainDTO.rowcount=a}),e.qZA()(),e._UZ(28,"br"),e.TgZ(29,"div",5)(30,"button",14),e.NdJ("click",function(a){return t.myClickFunction(a)}),e._uU(31,"Submit"),e.qZA()()()()()()()()),2&l&&(e.xp6(2),e.Q6J("options",!1),e.xp6(7),e.Q6J("ngModel",t.taskMainDTO.taskname),e.xp6(4),e.Q6J("ngModel",t.taskMainDTO.filelocation),e.xp6(7),e.Q6J("ngModel",t.taskMainDTO.filelocation2),e.xp6(7),e.Q6J("ngModel",t.taskMainDTO.rowcount))},dependencies:[r._Y,r.Fj,r.wV,r.JJ,r.JL,r.On,r.F,C.A]}),n})()}];let k=(()=>{class n{}return n.\u0275fac=function(l){return new(l||n)},n.\u0275mod=e.oAB({type:n}),n.\u0275inj=e.cJS({imports:[c.Bz.forChild(f),c.Bz]}),n})();var h=i(700);let T=(()=>{class n{}return n.\u0275fac=function(l){return new(l||n)},n.\u0275mod=e.oAB({type:n}),n.\u0275inj=e.cJS({imports:[d.ez,k,h.m]}),n})()}}]);