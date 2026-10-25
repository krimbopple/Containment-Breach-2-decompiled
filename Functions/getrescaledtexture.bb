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
    local1 = _FreeImage_Load(local0, arg0, arg1)
    local2 = _FreeImage_Rescale(local1, arg2, arg3, $00)
    local3 = ((getenv("Temp") + "\") + strippath(arg0))
    _FreeImage_Save(local0, local2, local3, arg1)
    If (arg4 <> 0) Then
        local4 = loadbrush_strict(local3, arg1, 1.0, 1.0)
    Else
        local4 = loadtexture_strict(local3, arg1, arg5, 1.0)
    EndIf
    _FreeImage_Unload(local1)
    local1 = $00
    _FreeImage_Unload(local2)
    local2 = $00
    deletefile(local3)
    Return local4
    Return $00
End Function
