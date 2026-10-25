Function createdoor.doors(arg0.rooms, arg1#, arg2#, arg3#, arg4#, arg5%, arg6%, arg7%, arg8%, arg9%)
    Local local0.doors
    Local local1%
    Local local2%
    Local local3#
    Local local4#
    Local local5#
    Local local6#
    Local local7#
    Local local8#
    Local local9%
    Local local10%
    Local local11%
    Local local12%
    Local local13#
    Local local15%
    If (arg0 <> Null) Then
        local1 = arg0\Field15
    Else
        local1 = arg9
    EndIf
    local0 = (New doors)
    local0\Field44 = arg7
    local0\Field52 = arg8
    local0\Field8 = (Int arg4)
    local0\Field39 = arg5
    local0\Field46 = arg6
    local0\Field47 = $01
    local0\Field10 = ((((arg5 And ((arg6 = $00) Lor (arg6 = $02))) And (arg7 = $00)) And (arg8 = $00)) And (rand($0A, $01) = $01))
    local0\Field32 = arg0
    Select arg6
        Case $00
            local10 = $00
            local11 = local10
            local6 = (1.0 / 13.97457)
            local7 = (1.0 / 19.86454)
            local8 = (1.0 / 18.04954)
            local9 = $00
            local3 = (1.0 / 256.0)
            local4 = (1.0 / 256.0)
            local5 = (1.0 / 256.0)
        Case $07,$08
            local10 = $09
            local11 = local10
            local6 = (1.0 / 16.24087)
            local7 = (1.0 / 19.92972)
            local8 = (1.0 / 18.04783)
            local9 = $00
            local3 = (1.0 / 256.0)
            local4 = (1.0 / 256.0)
            local5 = (1.0 / 256.0)
        Case $01
            local10 = $01
            local11 = local10
            local6 = (1.0 / 256.0)
            local7 = (1.0 / 256.0)
            local8 = (1.0 / 256.0)
            local9 = $00
            local3 = (1.0 / 256.0)
            local4 = (1.0 / 256.0)
            local5 = (1.0 / 256.0)
            local0\Field21 = $01
        Case $02
            local10 = $02
            local11 = $03
            local6 = (1.0 / 256.0)
            local7 = (1.0 / 256.0)
            local8 = (1.0 / 256.0)
            local9 = $00
            local3 = (1.0 / 256.0)
            local4 = (1.0 / 256.0)
            local5 = (1.0 / 256.0)
        Case $03
            local10 = $04
            local11 = $05
            local13 = (1.0 / 4.654545)
            local6 = local13
            local7 = local13
            local8 = local13
            local9 = $01
            local3 = local13
            local4 = local13
            local5 = local13
        Case $04
            local10 = $06
            local6 = (1.0 / 256.0)
            local7 = (1.0 / 256.0)
            local8 = (1.0 / 256.0)
            local9 = $02
            local3 = (1.0 / 256.0)
            local4 = (1.0 / 256.0)
            local5 = (1.0 / 256.0)
        Case $05
            local10 = $07
            local6 = (1.0 / 5.565217)
            local7 = 0.171875
            local8 = (1.0 / 5.565217)
            local9 = $03
            local3 = (1.0 / 5.688889)
            local4 = 0.171875
            local5 = (1.0 / 3.2)
        Case $06
            local10 = $08
            local13 = (1.0 / 2.56)
            local6 = local13
            local7 = local13
            local8 = local13
    End Select
    For local2 = $00 To $02 Step $01
        local0\Field37[local2] = $FFFFFFFF
    Next
    local15 = (arg6 = $03)
    If (arg6 <> $06) Then
        local0\Field51 = GUESSEDcopyentity_2(d_i\Field16[local9], $00)
        scaleentity(local0\Field51, local3, local4, local5, $00)
        If (local15 <> 0) Then
            entitytype(local0\Field51, $01, $00)
        EndIf
        entitypickmode(local0\Field51, $02, $01)
        local0\Field37[$02] = local9
    Else
        local0\Field51 = createpivot($00)
    EndIf
    positionentity(local0\Field51, arg1, arg2, arg3, $00)
    local0\Field0 = GUESSEDcopyentity_2(d_i\Field9[local10], $00)
    scaleentity(local0\Field0, local6, local7, local8, $00)
    positionentity(local0\Field0, arg1, arg2, arg3, $00)
    rotateentity(local0\Field0, 0.0, arg4, 0.0, $00)
    entitytype(local0\Field0, $07, $00)
    entitypickmode(local0\Field0, $02, $01)
    entityparent(local0\Field0, local1, $01)
    local0\Field37[$00] = local10
    local0\Field28 = (((arg6 = $04) Lor (arg6 = $05)) Lor (arg6 = $06))
    If (local0\Field28 = $00) Then
        local0\Field7 = GUESSEDcopyentity_2(d_i\Field9[local11], $00)
        scaleentity(local0\Field7, local6, local7, local8, $00)
        positionentity(local0\Field7, arg1, arg2, arg3, $00)
        rotateentity(local0\Field7, 0.0, (((Float (local15 = $00)) * 180.0) + arg4), 0.0, $00)
        entitytype(local0\Field7, $07, $00)
        entitypickmode(local0\Field7, $02, $01)
        entityparent(local0\Field7, local1, $01)
        local0\Field37[$01] = local11
    EndIf
    For local2 = $00 To $01 Step $01
        If (local0\Field28 <> 0) Then
            local0\Field40[local2] = createpivot($00)
            positionentity(local0\Field40[local2], (arg1 - ((0.12 * (Float (arg6 = $06))) + 0.22)), (((0.1 * (Float (arg6 = $06))) + 0.6) + arg2), ((arg3 + 0.1) + ((Float local2) * -0.2)), $00)
            entityradius(local0\Field40[local2], 0.1, 0.0)
            entitypickmode(local0\Field40[local2], $01, $01)
            entityparent(local0\Field40[local2], local0\Field51, $01)
        Else
            If (arg8 <> $00) Then
                local12 = $02
            ElseIf (arg7 > $00) Then
                local12 = $01
            ElseIf (((arg7 > $FFFFFFFC) And (arg7 < $00)) <> 0) Then
                local12 = $03
            Else
                local12 = $00
                If (arg6 = $01) Then
                    local12 = $04
                    local0\Field24[local2] = copyentity(d_i\Field14, $00)
                    scaleentity(local0\Field24[local2], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
                    rotateentity(local0\Field24[local2], 0.0, ((Float local2) * 180.0), 0.0, $00)
                    positionentity(local0\Field24[local2], arg1, (arg2 + 1.27), ((arg3 + 0.13) + ((Float local2) * -0.26)), $00)
                    entityparent(local0\Field24[local2], local0\Field51, $01)
                EndIf
            EndIf
            local0\Field40[local2] = createbutton(local12, ((((((Float local2) * -1.2) + 0.6) * (Float (local15 = $00))) + arg1) + (((((Float local2) * 864.0) + -432.0) * (1.0 / 256.0)) * (Float local15))), (arg2 + 0.7), ((((((Float local2) * 0.2) + -0.1) * (Float (local15 = $00))) + arg3) + (((((Float local2) * -384.0) + 192.0) * (Float local15)) * (1.0 / 256.0))), 0.0, ((((Float local2) * 180.0) * (Float (local15 = $00))) + ((((Float local2) * 180.0) + 90.0) * (Float local15))), 0.0, local0\Field51, local0\Field21, $01)
            local0\Field3[local2] = local12
            nameentity(local0\Field40[local2], ("B:" + (Str (Handle local0))))
        EndIf
    Next
    rotateentity(local0\Field51, 0.0, arg4, 0.0, $00)
    entityparent(local0\Field51, local1, $01)
    GUESSEDcountentity(local0, $FFFFFFFF)
    GUESSEDcreatedoor(local0)
    Return local0
    Return Null
End Function
