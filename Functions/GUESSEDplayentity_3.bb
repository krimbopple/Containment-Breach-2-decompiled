Function GUESSEDplayentity_3%()
    Local local0.T202XXZ0BFD
    Local local1.TX2BF6X0FF4
    Local local2#
    For local0 = Each T202XXZ0BFD
        If (local0\Field0 <> $00) Then
            If (local0\Field3 > $00) Then
                local1 = TXXF6F02DB2[local0\Field3]
                If (local1 <> Null) Then
                    tformpoint(entityx(local0\Field9, $00, 1.0), entityy(local0\Field9, $00, 1.0), entityz(local0\Field9, $00, 1.0), local1\Field52, $00)
                    positionentity(local0\Field0, tformedx(), tformedy(), tformedz(), $01)
                    rotateentity(local0\Field0, entitypitch(local1\Field50, $01, 1.0), entityyaw(local1\Field50, $01, 1.0), 0.0, $00)
                    turnentity(local0\Field0, entitypitch(local0\Field9, $00, 1.0), entityyaw(local0\Field9, $00, 1.0), entityroll(local0\Field9, $00, 1.0), $00)
                EndIf
            Else
                local2 = entitydistancesquared(local0\Field9, local0\Field0)
                If (local2 > local0\Field1) Then
                    positionentity(local0\Field0, entityx(local0\Field9, $00, 1.0), entityy(local0\Field9, $00, 1.0), entityz(local0\Field9, $00, 1.0), $00)
                    rotateentity(local0\Field0, entitypitch(local0\Field9, $00, 1.0), entityyaw(local0\Field9, $00, 1.0), entityroll(local0\Field9, $00, 1.0), $00)
                Else
                    GUESSEDpositionentityfromentity(local0\Field0, local0\Field9, local0\Field2, $01)
                EndIf
            EndIf
            If (((local0\Field7 And (1.0 > entitydistancesquared(XZ0260X8X2\Field74, local0\Field0))) And GUESSEDisentity_7(Null, local0\Field5, 0.8, $00, $03)) <> 0) Then
                playsoundex(buttonsfx[$00], camera, local0\Field0, 10.0, 1.0, $00, $00)
            EndIf
        EndIf
    Next
    Return $00
End Function
