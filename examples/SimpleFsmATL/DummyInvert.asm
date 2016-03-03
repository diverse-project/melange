<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="DummyInvert"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchInvertFsm():V"/>
		<constant value="A.__matchInvertStates():V"/>
		<constant value="A.__matchInvertTransitions():V"/>
		<constant value="__exec__"/>
		<constant value="InvertFsm"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyInvertFsm(NTransientLink;):V"/>
		<constant value="InvertStates"/>
		<constant value="A.__applyInvertStates(NTransientLink;):V"/>
		<constant value="InvertTransitions"/>
		<constant value="A.__applyInvertTransitions(NTransientLink;):V"/>
		<constant value="__matchInvertFsm"/>
		<constant value="FSM"/>
		<constant value="FsmMT"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="inputFsm"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="outputFsm"/>
		<constant value="Fsm"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="11:3-15:4"/>
		<constant value="__applyInvertFsm"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="ownedState"/>
		<constant value="finalState"/>
		<constant value="J.first():J"/>
		<constant value="initialState"/>
		<constant value="12:18-12:26"/>
		<constant value="12:18-12:37"/>
		<constant value="12:4-12:37"/>
		<constant value="13:20-13:28"/>
		<constant value="13:20-13:39"/>
		<constant value="13:20-13:48"/>
		<constant value="13:4-13:48"/>
		<constant value="14:18-14:26"/>
		<constant value="14:18-14:39"/>
		<constant value="14:4-14:39"/>
		<constant value="link"/>
		<constant value="__matchInvertStates"/>
		<constant value="State"/>
		<constant value="inputState"/>
		<constant value="outputState"/>
		<constant value="22:3-24:4"/>
		<constant value="__applyInvertStates"/>
		<constant value="Inverted"/>
		<constant value="J.+(J):J"/>
		<constant value="23:12-23:22"/>
		<constant value="23:25-23:35"/>
		<constant value="23:25-23:40"/>
		<constant value="23:12-23:40"/>
		<constant value="23:4-23:40"/>
		<constant value="__matchInvertTransitions"/>
		<constant value="Transition"/>
		<constant value="inputTrans"/>
		<constant value="outputTrans"/>
		<constant value="31:3-36:4"/>
		<constant value="__applyInvertTransitions"/>
		<constant value="input"/>
		<constant value="output"/>
		<constant value="target"/>
		<constant value="source"/>
		<constant value="32:13-32:23"/>
		<constant value="32:26-32:36"/>
		<constant value="32:26-32:42"/>
		<constant value="32:13-32:42"/>
		<constant value="32:4-32:42"/>
		<constant value="33:14-33:24"/>
		<constant value="33:27-33:37"/>
		<constant value="33:27-33:44"/>
		<constant value="33:14-33:44"/>
		<constant value="33:4-33:44"/>
		<constant value="34:14-34:24"/>
		<constant value="34:14-34:31"/>
		<constant value="34:4-34:31"/>
		<constant value="35:14-35:24"/>
		<constant value="35:14-35:31"/>
		<constant value="35:4-35:31"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<pcall arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<pcall arg="10"/>
			<pcall arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="15"/>
			<getasm/>
			<pcall arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="40"/>
			<getasm/>
			<pcall arg="41"/>
			<getasm/>
			<pcall arg="42"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="5"/>
		</localvariabletable>
	</operation>
	<operation name="43">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="44"/>
			<call arg="45"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="46"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="47"/>
			<call arg="45"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="48"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="49"/>
			<call arg="45"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="50"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="1" name="33" begin="15" end="18"/>
			<lve slot="1" name="33" begin="25" end="28"/>
			<lve slot="0" name="17" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="51">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="52"/>
			<push arg="53"/>
			<findme/>
			<push arg="54"/>
			<call arg="55"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="56"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="44"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="58"/>
			<load arg="19"/>
			<pcall arg="59"/>
			<dup/>
			<push arg="60"/>
			<push arg="52"/>
			<push arg="61"/>
			<new/>
			<pcall arg="62"/>
			<pusht/>
			<pcall arg="63"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="64" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="58" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="65">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="66"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="58"/>
			<call arg="67"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="60"/>
			<call arg="68"/>
			<store arg="69"/>
			<load arg="69"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="70"/>
			<call arg="30"/>
			<set arg="70"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="71"/>
			<call arg="72"/>
			<call arg="30"/>
			<set arg="73"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="73"/>
			<call arg="30"/>
			<set arg="71"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="74" begin="11" end="11"/>
			<lne id="75" begin="11" end="12"/>
			<lne id="76" begin="9" end="14"/>
			<lne id="77" begin="17" end="17"/>
			<lne id="78" begin="17" end="18"/>
			<lne id="79" begin="17" end="19"/>
			<lne id="80" begin="15" end="21"/>
			<lne id="81" begin="24" end="24"/>
			<lne id="82" begin="24" end="25"/>
			<lne id="83" begin="22" end="27"/>
			<lne id="64" begin="8" end="28"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="60" begin="7" end="28"/>
			<lve slot="2" name="58" begin="3" end="28"/>
			<lve slot="0" name="17" begin="0" end="28"/>
			<lve slot="1" name="84" begin="0" end="28"/>
		</localvariabletable>
	</operation>
	<operation name="85">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="86"/>
			<push arg="53"/>
			<findme/>
			<push arg="54"/>
			<call arg="55"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="56"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="47"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="87"/>
			<load arg="19"/>
			<pcall arg="59"/>
			<dup/>
			<push arg="88"/>
			<push arg="86"/>
			<push arg="61"/>
			<new/>
			<pcall arg="62"/>
			<pusht/>
			<pcall arg="63"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="89" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="87" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="90">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="66"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="87"/>
			<call arg="67"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="88"/>
			<call arg="68"/>
			<store arg="69"/>
			<load arg="69"/>
			<dup/>
			<getasm/>
			<push arg="91"/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="92"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="93" begin="11" end="11"/>
			<lne id="94" begin="12" end="12"/>
			<lne id="95" begin="12" end="13"/>
			<lne id="96" begin="11" end="14"/>
			<lne id="97" begin="9" end="16"/>
			<lne id="89" begin="8" end="17"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="88" begin="7" end="17"/>
			<lve slot="2" name="87" begin="3" end="17"/>
			<lve slot="0" name="17" begin="0" end="17"/>
			<lve slot="1" name="84" begin="0" end="17"/>
		</localvariabletable>
	</operation>
	<operation name="98">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="99"/>
			<push arg="53"/>
			<findme/>
			<push arg="54"/>
			<call arg="55"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="56"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="49"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="100"/>
			<load arg="19"/>
			<pcall arg="59"/>
			<dup/>
			<push arg="101"/>
			<push arg="99"/>
			<push arg="61"/>
			<new/>
			<pcall arg="62"/>
			<pusht/>
			<pcall arg="63"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="102" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="100" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="103">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="66"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="100"/>
			<call arg="67"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="101"/>
			<call arg="68"/>
			<store arg="69"/>
			<load arg="69"/>
			<dup/>
			<getasm/>
			<push arg="91"/>
			<load arg="29"/>
			<get arg="104"/>
			<call arg="92"/>
			<call arg="30"/>
			<set arg="104"/>
			<dup/>
			<getasm/>
			<push arg="91"/>
			<load arg="29"/>
			<get arg="105"/>
			<call arg="92"/>
			<call arg="30"/>
			<set arg="105"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="106"/>
			<call arg="30"/>
			<set arg="107"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="107"/>
			<call arg="30"/>
			<set arg="106"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="108" begin="11" end="11"/>
			<lne id="109" begin="12" end="12"/>
			<lne id="110" begin="12" end="13"/>
			<lne id="111" begin="11" end="14"/>
			<lne id="112" begin="9" end="16"/>
			<lne id="113" begin="19" end="19"/>
			<lne id="114" begin="20" end="20"/>
			<lne id="115" begin="20" end="21"/>
			<lne id="116" begin="19" end="22"/>
			<lne id="117" begin="17" end="24"/>
			<lne id="118" begin="27" end="27"/>
			<lne id="119" begin="27" end="28"/>
			<lne id="120" begin="25" end="30"/>
			<lne id="121" begin="33" end="33"/>
			<lne id="122" begin="33" end="34"/>
			<lne id="123" begin="31" end="36"/>
			<lne id="102" begin="8" end="37"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="101" begin="7" end="37"/>
			<lve slot="2" name="100" begin="3" end="37"/>
			<lve slot="0" name="17" begin="0" end="37"/>
			<lve slot="1" name="84" begin="0" end="37"/>
		</localvariabletable>
	</operation>
</asm>
