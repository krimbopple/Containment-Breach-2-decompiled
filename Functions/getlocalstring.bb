Function getlocalstring$(arg0$, arg1$)
    Local local0$
    local0 = inigetbufferstring("Data\local.ini", arg0, arg1, ((arg0 + ",") + arg1))
    Return inigetbufferstring((lang\Field0 + "Data\local.ini"), arg0, arg1, local0)
    Return ""
End Function
