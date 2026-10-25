Function graphics3dex%(arg0%, arg1%, arg2%, arg3%)
    Local local0%
    setgfxdriver(opt\Field32)
    If (getgraphicslevel() >= $64) Then
        If (arg3 = $01) Then
            arg3 = $04
        EndIf
    EndIf
    local0 = $00
    If (((arg3 = $04) And ((arg0 <> desktopwidth()) Lor (arg1 <> desktopheight()))) <> 0) Then
        arg3 = $03
        local0 = $01
    EndIf
    graphics3d(arg0, arg1, arg2, arg3)
    If (local0 <> 0) Then
        SetWindowLongA($FFFFFFF0, $80000000)
        desktopheight()
        SetWindowPos(opt\Field37, $00, $00, $00, desktopwidth(), opt\Field37, $40)
    EndIf
    hardwareskinning($01)
    texturepersistentcaching($01)
    GUESSEDcreategraphics()
    smallest_power_two = 512.0
    While ((((Float arg0) > smallest_power_two) Lor ((Float arg1) > smallest_power_two)) <> 0)
        smallest_power_two = (smallest_power_two * 2.0)
    Wend
    smallest_power_two_half = (smallest_power_two / 2.0)
    initfastresize()
    Return $00
End Function
