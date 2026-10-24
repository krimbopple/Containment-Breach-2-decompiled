Function Y0Z22266Z4%(arg0.TX2BF6X0FF4, arg1%, arg2%, arg3%, arg4%, arg5%, arg6%, arg7%)
    Local local0%
    Local local1%
    Local local2.menuslidebar
    Local local3.menuslidebar
    Local local4%
    Local local5%
    Local local6%
    Local local7%
    Local local8%
    Local local9#
    Local local10#
    Local local11%
    Local local12%
    Local local13%
    local0 = ((arg3 + arg4) - $01)
    local1 = (Int ((Float arg5) * 0.25))
    local2 = Null
    For local3 = Each menuslidebar
        If (local3\Field1 = (arg0\Field13 + $1643)) Then
            local2 = local3
            Exit
        EndIf
    Next
    local4 = mouseon(arg3, arg1, arg4, arg6)
    If (local2 <> Null) Then
        local4 = (local4 Lor mouseon(arg3, arg1, (arg4 + local1), arg6))
    EndIf
    If (local4 <> 0) Then
        renderframe(local0, arg1, local1, arg6, $00, $00, $00, $01)
    EndIf
    If (arg7 <> 0) Then
        rendermenuslidebars()
    EndIf
    local5 = Z000F6D6()
    If (arg0\Field21\Field1 <> $00) Then
        local5 = arg0\Field21\Field1
    EndIf
    local6 = ((Int (10.0 * menuscale)) + arg2)
    local7 = (((arg6 Sar $01) + arg1) - (Int ((Float imageheight(local5)) / 2.0)))
    local8 = mouseon(local6, local7, (imagewidth(local5) + $02), (imageheight(local5) + $02))
    If (arg0\Field38 <> Null) Then
        local9 = ((Float millisecs()) * 0.15)
        local10 = ((sin(local9) + 1.0) * 0.5)
        local11 = (Int ((55.0 * local10) + 200.0))
        local12 = (Int ((85.0 * local10) + 150.0))
        local13 = (Int ((40.0 * local10) + 10.0))
        If (local8 <> 0) Then
            color(local11, local12, local13, $FF)
            AD6628F0D = arg0\Field38
            Y68BX8F44 = local6
            B0D0444FB = local7
            T2XDZFBBBZ = imagewidth(local5)
            EBB4F42D2 = imageheight(local5)
        Else
            color(local11, local12, local13, $FF)
        EndIf
        rect((local6 - $02), (local7 - $02), (imagewidth(local5) + $04), (imageheight(local5) + $04), $00)
        rect((local6 - $01), (local7 - $01), (imagewidth(local5) + $02), (imageheight(local5) + $02), $00)
    Else
        color($96, ((local8 = $00) * $96), ((local8 = $00) * $96), $FF)
        rect((local6 - $01), (local7 - $01), (imagewidth(local5) + $02), (imageheight(local5) + $02), $00)
    EndIf
    drawimage(local5, local6, local7, $00)
    Return ((arg1 + arg6) - $01)
    Return $00
End Function
