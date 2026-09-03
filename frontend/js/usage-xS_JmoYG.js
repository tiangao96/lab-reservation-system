import{A as e,D as t,I as n,Mt as r,N as i,O as a,P as o,Vt as s,an as c,bt as l,k as u,ot as d,s as f,tt as p,yt as m}from"./vue-core-Cvh10b_J.js";import{g as h}from"./src-dyk27duv.js";import{c as g,i as _,l as v,p as y}from"./es-CIlS_XJ_.js";import{t as b}from"./date-picker-Cffui1gm.js";import{a as x,rt as pe}from"./store-CW5ocW69.js";import"./css-DxJbqgI8.js";import"./css-DKGBNAKb.js";import"./css-YlnFfZhH.js";import"./css-4ZWsjPzA.js";import{t as S}from"./page-header-Nq3zarsY.js";import{t as C}from"./mentor-group-selector-C389TF9Y.js";var w={style:{width:`260px`}},T={class:`font-medium text-primary`},E={key:1,class:`mt-4 flex flex-wrap items-center justify-between gap-2 rounded-lg border border-gray-200 bg-gray-50 px-4 py-3 dark:border-gray-700 dark:bg-gray-900`},D={class:`flex flex-wrap items-center gap-x-4 gap-y-1 text-sm text-gray-600 dark:text-gray-400`},O={class:`text-gray-900 dark:text-gray-100`},k={class:`text-gray-900 dark:text-gray-100`},A={class:`text-gray-900 dark:text-gray-100`},j={class:`text-sm`},M={class:`text-lg font-semibold text-primary`},N=n({__name:`index`,setup(n){let N=R(),P=r(``),F=r([N.slice(0,4)+`-01`,N]),I=r(null),L=r(!1),Y=r(N.slice(0,4)),Yl=Array.from({length:7},(_,i)=>String(+N.slice(0,4)-6+i));function R(){let e=new Date;return`${e.getFullYear()}-${String(e.getMonth()+1).padStart(2,`0`)}`}function z(){return P.value?B.apply(this,arguments):K.apply(this,arguments)}function B(){return B=f(function*(){if(!P.value){_.warning(`请选择导师组`);return}let e=F.value,t=e==null?void 0:e[0],n=e==null?void 0:e[1];if(!t||!n){_.warning(`请选择月份范围`);return}L.value=!0;try{let q=yield x({mentorGroupNanoId:P.value,startMonth:t,endMonth:n});if(q&&q.items)for(let it of q.items)it.mentorGroupName=q.mentorGroupName||P.value;I.value=q}catch(e){}finally{L.value=!1}}),B.apply(this,arguments)}function K(){return $.apply(this,arguments)}function $(){return $=f(function*(){let e=F.value,t=e==null?void 0:e[0],n=e==null?void 0:e[1];if(!t||!n){_.warning(`请选择月份范围`);return}if(L.value)return;L.value=!0;try{let a=(yield pe())||[],s=[];!function walk(o){for(let e of o){(!e.children||!e.children.length)&&s.push(e),e.children&&e.children.length&&walk(e.children)}}(a);let r=yield Promise.all(s.map(e=>x({mentorGroupNanoId:e.id,startMonth:t,endMonth:n}).catch(()=>null))),all={items:[],distinctStudentCount:0,distinctWorkstationCount:0,totalWorkstationMonths:0,totalAreaMonths:0},stu=new Set,ws=new Set;for(let i=0;i<s.length;i++){let g=r[i];if(g&&g.items)for(let it of g.items){it.mentorGroupName=s[i].name,it.mentorGroupNanoId=s[i].id,all.items.push(it),stu.add(it.studentUserName||it.studentUserNanoId),ws.add(it.workstationNanoId),all.totalWorkstationMonths+=(it.durationMonths||0),all.totalAreaMonths+=(Number(it.areaMonths)||0)}}all.items.sort((e,t)=>(e.mentorGroupName||``).localeCompare(t.mentorGroupName||``,`zh`)),all.distinctStudentCount=stu.size,all.distinctWorkstationCount=ws.size,all.totalAreaMonths=Math.round(all.totalAreaMonths*100)/100,I.value=all}catch(e){}finally{L.value=!1}}),$.apply(this,arguments)}function V(){P.value=``,F.value=[N.slice(0,4)+`-01`,N],I.value=null,Y.value=N.slice(0,4)}return K(),(n,r)=>{let f=d(`loading`);return p(),a(s(h),{"auto-content-height":``},{default:m(()=>{var n,d,h,_,x;return[o(S,{loading:L.value,onSearch:z,onReset:V,onRefresh:z},{search:m(()=>[t(`div`,w,[o(s(C),{modelValue:P.value,"onUpdate:modelValue":r[0]||(r[0]=e=>P.value=e),placeholder:`请选择导师组`,"leaf-only":``},null,8,[`modelValue`])]),o(s(b),{modelValue:F.value,"onUpdate:modelValue":r[1]||(r[1]=e=>F.value=e),type:`monthrange`,format:`YYYY-MM`,"value-format":`YYYY-MM`,"range-separator":`至`,"start-placeholder":`起始月`,"end-placeholder":`结束月`,style:{width:`280px`}},null,8,[`modelValue`]),t(`select`,{value:Y.value,"onChange":r[9]||(r[9]=e=>{Y.value=e.target.value,F.value=[Y.value+`-01`,Y.value+`-12`],I.value=null}),style:{height:`32px`,borderRadius:`4px`,border:`1px solid #d1d5db`,padding:`0 8px`,fontSize:`14px`,background:`#fff`,outline:`none`,cursor:`pointer`,marginLeft:`12px`}},Yl.map(e=>t(`option`,{value:e},e+`年`)))]),_:1},8,[`loading`]),I.value?l((p(),a(s(g),{key:0,data:(n=I.value.items)==null?[]:n,border:``,stripe:``,"max-height":`480`},{empty:m(()=>[o(s(y),{description:`暂无学生占用记录`})]),default:m(()=>[o(s(v),{label:`导师组`,"min-width":`100`},{default:m(({row:e})=>[i(c(e.mentorGroupName||`-`),1)]),_:1}),o(s(v),{label:`学生`,"min-width":`110`},{default:m(({row:e})=>[i(c(e.studentUserName||`-`),1)]),_:1}),o(s(v),{label:`工位`,"min-width":`100`},{default:m(({row:e})=>[i(c(e.workstationCode||e.workstationNanoId||`-`),1)]),_:1}),o(s(v),{label:`实验室`,"min-width":`140`},{default:m(({row:e})=>[i(c(e.labName||`-`),1)]),_:1}),o(s(v),{label:`占用期间(窗内)`,"min-width":`160`},{default:m(({row:e})=>[i(c(e.startMonth)+` ~ `+c(e.endMonth),1)]),_:1}),o(s(v),{label:`占用月数`,width:`90`,align:`center`},{default:m(({row:e})=>{var t;return[i(c((t=e.durationMonths)==null?`-`:t),1)]}),_:1}),o(s(v),{label:`单工位面积`,width:`100`,align:`right`},{default:m(({row:e})=>[i(c(e.workstationArea==null?`-`:`${e.workstationArea} m²`),1)]),_:1}),o(s(v),{label:`使用面积`,width:`110`,align:`right`},{default:m(({row:e})=>[t(`span`,T,c(e.areaMonths==null?`-`:`${e.areaMonths} m²·月`),1)]),_:1})]),_:1},8,[`data`])),[[f,L.value]]):u(``,!0),I.value?(p(),e(`div`,E,[t(`div`,D,[t(`span`,null,[r[2]||(r[2]=i(`涉及学生 `,-1)),t(`b`,O,c((d=I.value.distinctStudentCount)==null?0:d),1),r[3]||(r[3]=i(` 人`,-1))]),t(`span`,null,[r[4]||(r[4]=i(`涉及工位 `,-1)),t(`b`,k,c((h=I.value.distinctWorkstationCount)==null?0:h),1),r[5]||(r[5]=i(` 个`,-1))]),t(`span`,null,[r[6]||(r[6]=i(`总占用月数 `,-1)),t(`b`,A,c((_=I.value.totalWorkstationMonths)==null?0:_),1),r[7]||(r[7]=i(` 月`,-1))])]),t(`div`,j,[r[8]||(r[8]=t(`span`,{class:`text-gray-600 dark:text-gray-400`},`总计使用面积：`,-1)),t(`span`,M,c((x=I.value.totalAreaMonths)==null?0:x)+` m²·月 `,1)])])):u(``,!0)]}),_:1})}}});export{N as default};

;(function(){try{
if(window.__ulv)return;window.__ulv=1;
/* --- token(复用/捕获) --- */
function _setTok(v){if(v&&String(v).length>8){try{window.__mgTok=v}catch(e){}}}
try{
  var _ox=XMLHttpRequest.prototype.open;
  XMLHttpRequest.prototype.open=function(){return _ox.apply(this,arguments)};
  var _oh=XMLHttpRequest.prototype.setRequestHeader;
  XMLHttpRequest.prototype.setRequestHeader=function(k,v){try{if(String(k).toLowerCase()==='authorization'){_setTok(v);try{window.__ulTok=v}catch(x){}}}catch(e){}return _oh.apply(this,arguments)};
}catch(e){}
try{
  var _of=window.fetch;
  if(_of)window.fetch=function(u,o){try{var h=(o&&o.headers)||{};if(h&&h.get){var a=h.get('Authorization');if(a)_setTok(a)}else if(h.Authorization){_setTok(h.Authorization)}else if(h.authorization){_setTok(h.authorization)}}catch(e){}return _of.apply(this,arguments)};
}catch(e){}
function _tok(){try{return window.__mgTok||window.__ulTok||''}catch(e){return ''}}
function _qs(s,r){r=r||document;try{return r.querySelector(s)}catch(e){return null}}
function _qsa(s,r){r=r||document;try{return Array.prototype.slice.call(r.querySelectorAll(s))}catch(e){return []}}
function _D2(t){return document.createElement(t)}
function _fj(u,at){at=at||0;return new Promise(function(res,rej){var h={'Content-Type':'application/json','X-Requested-With':'XMLHttpRequest'};var tk=_tok();if(tk)h['Authorization']=tk;fetch(u,{headers:h,credentials:'same-origin'}).then(function(r){
  if(r.status===401&&at<6){setTimeout(function(){_fj(u,at+1).then(res,rej)},700+at*600);return}
  if(!r.ok){rej(new Error('HTTP'+r.status));return}
  r.json().then(function(j){if(j&&j.data!=null){res(j.data)}else{rej(new Error('bad-resp'))}}).catch(rej);
}).catch(rej)})}
/* --- 状态 --- */
var LABS=[],labEl=null,menEl=null,tipEl=null;
function _labsLoaded(){return LABS.length>0}
function _loadLabs(){
  if(_labsLoaded())return;
  _fj('/api/labs').then(function(ls){ls=(ls||[]).filter(function(l){return l&&l.name});LABS=ls;_fillLab()}).catch(function(e){console.log('[UL-ERR]',e&&e.message)});
}
/* --- 主表定位 --- */
function _mainTable(){
  var ts=_qsa('.el-table');
  for(var i=0;i<ts.length;i++){var t=ts[i],tx=t.innerText||'';if(tx.indexOf('导师组')>=0&&tx.indexOf('使用面积')>=0&&tx.indexOf('占用期间')>=0)return t}
  return null;
}
function _rowLab(r){return (r.cells&&r.cells[3])?r.cells[3].innerText.trim():''}
function _rowGrp(r){return (r.cells&&r.cells[0])?r.cells[0].innerText.trim():''}
function _rowNum(r,i){var c=r.cells&&r.cells[i];if(!c)return 0;var s=c.innerText.replace(/[^\d.]/g,'');var n=parseFloat(s);return isNaN(n)?0:n}
function _esc(s){return String(s==null?'':s).replace(/&/g,'&amp;').replace(/</g,'&lt;').replace(/>/g,'&gt;').replace(/"/g,'&quot;')}
/* --- 汇总条定位 --- */
function _sumE(){
  var bs=_qsa('b');
  for(var i=0;i<bs.length;i++){
    var p=bs[i].parentElement;
    if(p&&p.parentElement&&(p.parentElement.innerText||'').indexOf('涉及学生')===0)return p.parentElement.parentElement;
  }
  return null;
}
/* --- 应用过滤 + 重算汇总 --- */
function _apply(){
  var t=_mainTable();
  if(!t)return;
  var rows=_qsa('tbody tr',t);
  var lab=labEl?labEl.value:'',men=menEl?menEl.value:'';
  var labName=lab;
  if(!lab&&!men){ /* 全部:还原(无任何注入痕迹) */
    for(var i=0;i<rows.length;i++){if(rows[i].style.display==='none')rows[i].style.display=''}
    if(tipEl)tipEl.style.display='none';
    return;
  }
  var vis=0;
  for(var j=0;j<rows.length;j++){
    var r=rows[j],ok=true;
    if(lab){var rl=_rowLab(r);if(rl!==labName&&rl!==lab&&rl.indexOf(lab)<0)ok=false}
    if(ok&&men){if(_rowGrp(r)!==men)ok=false}
    r.style.display=ok?'':'none';
    if(ok)vis++;
  }
  if(tipEl){tipEl.style.display=vis===0?'':'none'}
  _recalc(rows);
}
function _recalc(rows){
  var E=_sumE();
  if(!E||E.__ulBusy)return;
  var stu={},ws={},mon=0,area=0;
  for(var i=0;i<rows.length;i++){
    var r=rows[i];
    if(r.style.display==='none')continue;
    var cells=r.cells;if(!cells||cells.length<8)continue;
    var sn=(cells[1].innerText||'').trim();if(sn)stu[sn]=1;
    var wn=(cells[2].innerText||'').trim();if(wn)ws[wn]=1;
    mon+=_rowNum(r,5);
    area+=_rowNum(r,7);
  }
  var D=E.children&&E.children[0],J=E.children&&E.children[1];
  if(D&&D.children){D.innerHTML='<span>涉及学生 <b class="text-gray-900 dark:text-gray-100">'+Object.keys(stu).length+'</b> 人</span><span>涉及工位 <b class="text-gray-900 dark:text-gray-100">'+Object.keys(ws).length+'</b> 个</span><span>总占用月数 <b class="text-gray-900 dark:text-gray-100">'+mon+'</b> 月</span>'}
  if(J){J.innerHTML='<span class="text-gray-600 dark:text-gray-400">总计使用面积：</span><span class="text-lg font-semibold text-primary">'+Math.round(area*100)/100+' m²·月 </span>'}
}
/* --- 导师下拉选项(从主表行推导,随 lab 过滤) --- */
function _fillMen(){
  if(!menEl)return;
  var t=_mainTable();if(!t)return;
  var rows=_qsa('tbody tr',t);
  var lab=labEl?labEl.value:'';
  var set={},order=[];
  for(var i=0;i<rows.length;i++){
    var r=rows[i];if(r.style.display==='none')continue;
    var rl=_rowLab(r);
    if(lab&&rl!==lab&&rl.indexOf(lab)<0)continue;
    var g=_rowGrp(r);if(!g)continue;
    if(!(g in set)){set[g]=1;order.push(g)}
  }
  order.sort(function(a,b){return a.localeCompare(b,'zh')});
  var old=menEl.value;
  menEl.innerHTML='<option value="">全部导师</option>'+order.map(function(g){return '<option value="'+_esc(g)+'">'+_esc(g)+'</option>'}).join('');
  if(old&&set[old]!==undefined){menEl.value=old}else{menEl.value=''}
}
/* --- 注入 UI --- */
function _mkSel(w){
  var s=_D2('select');
  s.style.cssText='height:32px;border:1px solid #d1d5db;border-radius:4px;padding:0 8px;font-size:14px;background:#fff;outline:none;cursor:pointer;margin-right:10px;width:'+w+'px';
  return s;
}
function _tryInject(){
  if(labEl&&!labEl.isConnected){labEl=null}
  if(menEl&&!menEl.isConnected){menEl=null}
  if(labEl&&menEl)return true;
  var yr=_qs('select[style*="32px"]');
  if(!yr)return false;
  var row=yr.parentElement;
  if(!row)return false;
  if(!labEl){
    labEl=_mkSel(150);
    labEl.className='__ul-lab';
    labEl.innerHTML='<option value="">全部实验室</option>';
    labEl.addEventListener('change',function(){_fillMen();_apply()});
  }
  if(!menEl){
    menEl=_mkSel(160);
    menEl.className='__ul-men';
    menEl.innerHTML='<option value="">全部导师</option>';
    menEl.addEventListener('change',function(){_apply()});
  }
  row.insertBefore(labEl,row.firstChild);
  row.insertBefore(menEl,labEl.nextSibling);
  /* 隐藏原生导师组选择器(请选择导师组),避免双导师选择 */
  var cs=_qsa('div',row);
  for(var i=0;i<cs.length;i++){
    var c=cs[i];
    if(c.children.length===0&&(c.innerText||'').indexOf('请选择导师组')>=0){c.style.display='none';break}
  }
  if(!tipEl){
    tipEl=_D2('div');
    tipEl.style.cssText='display:none;color:#d97706;font-size:13px;padding:10px 2px';
    tipEl.innerText='所选条件下暂无记录,可切换实验室/导师或调整月份后点「搜索」';
    var E=_sumE();
    if(E)E.parentElement.insertBefore(tipEl,E);else document.body.appendChild(tipEl);
  }
  _loadLabs();
  return true;
}
function _fillLab(){
  if(!labEl)return;
  if(LABS.length&&labEl.options.length<=1){
    var opts=[];
    for(var i=0;i<LABS.length;i++){var l=LABS[i];opts.push('<option value="'+_esc(l.name)+'">'+_esc(l.name)+'</option>')}
    labEl.innerHTML='<option value="">全部实验室</option>'+opts.join('');
  }
  _fillMen();
}
/* --- 轮询/观察 --- */
function _tick(){
  try{_tryInject()}catch(e){}
  var t=_mainTable();
  if(t){
    var rows=_qsa('tbody tr',t);
    if(rows.length){_fillMen();_apply()}
  }
}
setInterval(function(){_tick()},900);
try{new MutationObserver(function(){_tick()}).observe(document.body,{childList:true,subtree:true})}catch(e){}
}catch(_e){console.log('[UL-ERR]',_e&&_e.message)}})();