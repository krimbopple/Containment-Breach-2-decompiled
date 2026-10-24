Function X8Z6FF6ZZ6%(arg0%, arg1#, arg2#)
    Local local0#
    Local local1$
    Local local2#
    Local local3#
    Local local4#
    Local local5#
    Local local6#
    Local local7#
    If (0.0 < getentityalpha(arg0)) Then
        moveentity(arg0, 0.0, 0.0, (fps\Field3[$00] * arg1), $00)
        local0 = 1.0
        local1 = entityname(arg0)
        If (local1 <> "") Then
            local2 = (Float T26ZD804D6(local1, " ", $00))
            local3 = (Float T26ZD804D6(local1, " ", $01))
            local4 = (Float T26ZD804D6(local1, " ", $02))
            local5 = entityscalez(arg0, $01, 1.0)
            scaleentity(arg0, 0.1, 0.1, 0.15, $01)
            tformpoint(local2, local3, local4, $00, arg0)
            scaleentity(arg0, 0.1, 0.1, local5, $01)
            local6 = meshdepth(arg0)
            local7 = tformedz()
            local0 = max((local7 / local6), 0.0)
        EndIf
        If (1.0 <= local0) Then
            entityalpha(arg0, max((getentityalpha(arg0) - (fps\Field3[$00] * arg2)), 0.0))
            scaleentity(arg0, 0.1, 0.1, 0.15, $00)
            If (0.005 >= getentityalpha(arg0)) Then
                positionentity(arg0, -99990.0, -99990.0, -99990.0, $01)
            EndIf
        Else
            scaleentity(arg0, entityscalex(arg0, $01, 1.0), entityscaley(arg0, $01, 1.0), max((0.15 * local0), 0.001), $01)
            If (0.01 > local0) Then
                positionentity(arg0, -99990.0, -99990.0, -99990.0, $01)
                entityalpha(arg0, 0.0)
            EndIf
        EndIf
    EndIf
    Return $00
End Function
