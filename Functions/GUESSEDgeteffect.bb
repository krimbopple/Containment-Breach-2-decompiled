Function GUESSEDgeteffect%(arg0$, arg1$, arg2%)
    Local local0%
    GUESSEDhasfunc(arg0)
    local0 = loadeffect(arg0, arg1)
    If ((arg2 And (geteffecterror() <> "")) <> 0) Then
        runtimeerrorex(format(format(getlocalstring("runerr", "failedeffect"), arg0, "{0}"), geteffecterror(), "{1}"))
    EndIf
    GUESSEDloadstrict_2()
    Return local0
    Return $00
End Function
