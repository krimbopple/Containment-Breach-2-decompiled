Function AZX8Z8FF%()
    Local local0.TX2BF6X0FF4
    Local local1#
    Local local2#
    Local local3#
    Local local4#
    Local local5#
    Local local6.TX2BF6X0FF4
    TXXBZ06X4BX()
    For local0 = Each TX2BF6X0FF4
        TXFB22FF044(local0)
        If (((local0\Field52 <> $00) And (local0\Field13 <> TXXDZB2ZBXX())) <> 0) Then
            TX62ZFF4X66(local0)
            If (TXB2BFFFFFX() = $00) Then
                If ((local0\Field4 And (4.0 > entitydistancesquared(local0\Field52, XZ0260X8X2\Field74))) <> 0) Then
                    If (getentitytype(local0\Field52) = $00) Then
                        entitytype(local0\Field52, $02, $00)
                    EndIf
                ElseIf (getentitytype(local0\Field52) = $02) Then
                    entitytype(local0\Field52, $00, $00)
                EndIf
            EndIf
            local0\Field6 = curveangle(local0\Field1, local0\Field6, 2.5)
            local0\Field8 = curvevalue(local0\Field36, local0\Field8, 2.5)
            If (4.0 > distancesquared(entityx(local0\Field52, $00, 1.0), local0\Field19, entityy(local0\Field52, $00, 1.0), local0\Field49, entityz(local0\Field52, $00, 1.0), local0\Field26)) Then
                local1 = entityx(local0\Field52, $00, 1.0)
                local2 = entityy(local0\Field52, $00, 1.0)
                local3 = entityz(local0\Field52, $00, 1.0)
                local0\Field40 = ((local0\Field17 * fps\Field3[$00]) + local0\Field40)
                If (1.0 < local0\Field40) Then
                    local0\Field40 = 1.0
                EndIf
                positionentity(local0\Field52, XF28BZ6DDD(local0\Field33, local0\Field19, local0\Field40), XF28BZ6DDD(local0\Field34, local0\Field49, local0\Field40), XF28BZ6DDD(local0\Field51, local0\Field26, local0\Field40), $00)
                local0\Field14 = distance(local1, entityx(local0\Field52, $00, 1.0), local2, entityy(local0\Field52, $00, 1.0), local3, entityz(local0\Field52, $00, 1.0))
            Else
                positionentity(local0\Field52, local0\Field19, local0\Field49, local0\Field26, $00)
                local0\Field33 = local0\Field19
                local0\Field34 = local0\Field49
                local0\Field51 = local0\Field26
                local0\Field40 = 1.0
            EndIf
            resetentity(local0\Field52)
            rotateentity(local0\Field52, 0.0, local0\Field6, 0.0, $00)
            local4 = 0.0
            local5 = 1.0
            If (local0\Field55\Field5 <> Null) Then
                local4 = local0\Field55\Field5\Field38
                If (0.0 < local0\Field55\Field6) Then
                    local5 = local0\Field55\Field6
                EndIf
            EndIf
            positionentity(local0\Field50, 0.0, (((((Float local0\Field37) * -0.3) + 0.6) + local4) * local5), 0.0, $00)
            rotateentity(local0\Field50, local0\Field8, local0\Field6, 0.0, $01)
            YDX288ZZX(local0)
        EndIf
        CZBF4F6X(local0)
    Next
    If ((((((invopen Lor i_294\Field4) Lor (otheropen <> Null)) Lor (d_i\Field3 <> Null)) Lor (selectedscreen <> Null)) Lor ((((menuopen Lor consoleopen) Lor (0.0 > XZ0260X8X2\Field2)) Lor TX6X48DXXDX) And (X4BX024DX0() <> $00))) = $00) Then
        If ((((TXB2BFFFFFX() = $00) And ((TDD0Z6BXB6\Field7 Lor TDD0Z6BXB6\Field12) Lor TDD0Z6BXB6\Field2)) And (TXXF6F02DB2[TXXDZB2ZBXX()] <> Null)) <> 0) Then
            TZZZ68X802($01)
            TXF820XX40Z(TXXF6F02DB2[TXXDZB2ZBXX()])
            If (((entitypick(camera, 1.0) <> $00) And (left(entityname(pickedentity()), $02) = "P:")) <> 0) Then
                local6 = (Object.TX2BF6X0FF4 (Int T26ZD804D6(entityname(pickedentity()), ":", $01)))
                TX4X220Z86D(local6, ((TDD0Z6BXB6\Field7 + (TDD0Z6BXB6\Field12 Shl $01)) + (TDD0Z6BXB6\Field2 Shl $02)))
            EndIf
            TZZZ68X802($00)
        EndIf
    EndIf
    Return $00
End Function
