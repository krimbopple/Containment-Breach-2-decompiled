Function createsubtitlestoken%(arg0$, arg1.sound)
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    Local local5%
    Local local6%
    Local local7%
    Local local8%
    Local local9%
    Local local10$
    Local local11#
    Local local12#
    Local local13%
    Local local14%
    Local local15%
    Local local16%
    If (((opt\Field53 = $00) Lor (subtitlesinit = $00)) <> 0) Then
        Return $00
    EndIf
    If (selecteddifficulty\Field7 = difficulties[$03]\Field7) Then
        Return $00
    EndIf
    local1 = _JsonGetValue(localsubfile, arg0)
    If ((_JsonIsNull(local1) Lor (_JsonIsArray(local1) = $00)) <> 0) Then
        local2 = _JsonGetValue(localsubfile, "fallback")
        If ((_JsonGetBool(local2) Lor _JsonIsNull(local2)) <> 0) Then
            local1 = _JsonGetValue(subfile, arg0)
        EndIf
        If (_JsonIsArray(local1) = $00) Then
            Return $00
        EndIf
    EndIf
    local3 = _JsonGetArray(local1)
    local4 = _JsonGetArraySize(local3)
    For local0 = $00 To (local4 - $01) Step $01
        local5 = _JsonGetArrayValue(local3, local0)
        local6 = _JsonGetValue(local5, "text")
        local7 = _JsonGetValue(local5, "delay")
        local8 = _JsonGetValue(local5, "length")
        local10 = "missingno"
        local11 = 0.0
        local12 = 10.0
        local13 = $FF
        local14 = $FF
        local15 = $FF
        If (_JsonIsString(local6) <> 0) Then
            local10 = _JsonGetString(local6)
        EndIf
        If (_JsonIsFloat(local7) <> 0) Then
            local11 = _JsonGetFloat(local7)
        EndIf
        If (_JsonIsFloat(local8) <> 0) Then
            local12 = _JsonGetFloat(local8)
        EndIf
        If (_JsonIsNull(_JsonGetValue(local5, "color")) = $00) Then
            local9 = _JsonGetValue(subcolors, _JsonGetString(_JsonGetValue(local5, "color")))
            If (_JsonIsArray(local9) = $00) Then
                local9 = _JsonGetValue(localsubcolors, _JsonGetString(_JsonGetValue(local5, "color")))
            EndIf
            If (_JsonIsArray(local9) <> 0) Then
                local16 = _JsonGetArray(local9)
                local13 = _JsonGetInt(_JsonGetArrayValue(local16, $00))
                local14 = _JsonGetInt(_JsonGetArrayValue(local16, $01))
                local15 = _JsonGetInt(_JsonGetArrayValue(local16, $02))
            EndIf
        EndIf
        queuesubtitlesmsg(arg0, arg1, local10, local11, local12, local13, local14, local15)
    Next
    Return $00
End Function
