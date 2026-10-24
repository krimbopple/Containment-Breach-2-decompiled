Function getrescaledtexture%(arg0$, arg1%, arg2%, arg3%, arg4%, arg5%)
    Local local0%
    Local local1%
    Local local2%
    Local local3$
    Local local4%
    If (filetype((lang\Field0 + arg0)) = $01) Then
        arg0 = (lang\Field0 + arg0)
    EndIf
    
    local0 = eax_001A
    local1 = X44686XB2Z(local0, arg0, arg1)
    local2 = XXZF2Z6642(local1, arg2, arg3, $00)
    local3 = ((getenv("Temp") + "\") + strippath(arg0))
    T484Z4X4B(local0, local2, local3, arg1)
    If (arg4 <> 0) Then
        local4 = loadbrush_strict(local3, arg1, 1.0, 1.0)
    Else
        local4 = loadtexture_strict(local3, arg1, arg5, 1.0)
    EndIf
    BB664D0D(local1)
    local1 = $00
    BB664D0D(local2)
    local2 = $00
    deletefile(local3)
    Return local4
    Return $00
End Function
