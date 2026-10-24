Function blitz_C4X60DZD20#(arg0#, arg1#, arg2#, arg3%)
    Local local0#
    local0 = (((fps\Field3[arg3] * (1.0 / arg2)) * (arg0 - arg1)) + arg1)
    If (arg1 > arg0) Then
        Return max(local0, arg0)
    Else
        Return min(local0, arg0)
    EndIf
    Return 0.0
End Function
