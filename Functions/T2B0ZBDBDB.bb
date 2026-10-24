Function T2B0ZBDBDB%(arg0$, arg1$, arg2%)
    Local local0%
    T8648Z2B2Z(arg0)
    local0 = loadeffect(arg0, arg1)
    If ((arg2 And (geteffecterror() <> "")) <> 0) Then
        runtimeerrorex(format(format(getlocalstring("runerr", "failedeffect"), arg0, "{0}"), geteffecterror(), "{1}"))
    EndIf
    XB04X8D680()
    Return local0
    Return $00
End Function
