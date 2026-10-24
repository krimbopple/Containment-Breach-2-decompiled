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
    local1 = TX0Z2Z4F86D(localsubfile, arg0)
    If ((TF46ZF6DB6(local1) Lor (T4FDZFB8X4(local1) = $00)) <> 0) Then
        local2 = TX0Z2Z4F86D(localsubfile, "fallback")
        If ((TX8B6FFF244(local2) Lor TF46ZF6DB6(local2)) <> 0) Then
            local1 = TX0Z2Z4F86D(subfile, arg0)
        EndIf
        If (T4FDZFB8X4(local1) = $00) Then
            Return $00
        EndIf
    EndIf
    local3 = TD4644B68Z(local1)
    local4 = TD0DFDZ4XX(local3)
    For local0 = $00 To (local4 - $01) Step $01
        local5 = D8XX4X0D0(local3, local0)
        local6 = TX0Z2Z4F86D(local5, "text")
        local7 = TX0Z2Z4F86D(local5, "delay")
        local8 = TX0Z2Z4F86D(local5, "length")
        local10 = "missingno"
        local11 = 0.0
        local12 = 10.0
        local13 = $FF
        local14 = $FF
        local15 = $FF
        If (X226BZ44BX(local6) <> 0) Then
            local10 = TX240XXB6Z6(local6)
        EndIf
        If (TXBD466XBZ2(local7) <> 0) Then
            local11 = T4BFX842B(local7)
        EndIf
        If (TXBD466XBZ2(local8) <> 0) Then
            local12 = T4BFX842B(local8)
        EndIf
        If (TF46ZF6DB6(TX0Z2Z4F86D(local5, "color")) = $00) Then
            local9 = TX0Z2Z4F86D(subcolors, TX240XXB6Z6(TX0Z2Z4F86D(local5, "color")))
            If (T4FDZFB8X4(local9) = $00) Then
                local9 = TX0Z2Z4F86D(localsubcolors, TX240XXB6Z6(TX0Z2Z4F86D(local5, "color")))
            EndIf
            If (T4FDZFB8X4(local9) <> 0) Then
                local16 = TD4644B68Z(local9)
                local13 = XB2460ZF4(D8XX4X0D0(local16, $00))
                local14 = XB2460ZF4(D8XX4X0D0(local16, $01))
                local15 = XB2460ZF4(D8XX4X0D0(local16, $02))
            EndIf
        EndIf
        queuesubtitlesmsg(arg0, arg1, local10, local11, local12, local13, local14, local15)
    Next
    Return $00
End Function
