Function X060Z64X28%()
    Local local0.TX2BXBZF2B6
    Local local1.TX2BF6X0FF4
    Local local2#
    For local0 = Each TX2BXBZF2B6
        If (local0\Field2 > $00) Then
            local1 = TXXF6F02DB2[local0\Field2]
            If (local1 <> Null) Then
                tformpoint(entityx(local0\Field1, $00, 1.0), entityy(local0\Field1, $00, 1.0), entityz(local0\Field1, $00, 1.0), local1\Field52, $00)
                positionentity(local0\Field4, tformedx(), tformedy(), tformedz(), $01)
                rotateentity(local0\Field4, entitypitch(local1\Field50, $01, 1.0), entityyaw(local1\Field50, $01, 1.0), 0.0, $00)
                turnentity(local0\Field4, entitypitch(local0\Field1, $00, 1.0), entityyaw(local0\Field1, $00, 1.0), entityroll(local0\Field1, $00, 1.0), $00)
            EndIf
        Else
            local2 = entitydistancesquared(local0\Field1, local0\Field4)
            If (local2 > local0\Field0) Then
                positionentity(local0\Field4, entityx(local0\Field1, $00, 1.0), entityy(local0\Field1, $00, 1.0), entityz(local0\Field1, $00, 1.0), $00)
                rotateentity(local0\Field4, entitypitch(local0\Field1, $00, 1.0), entityyaw(local0\Field1, $00, 1.0), entityroll(local0\Field1, $00, 1.0), $00)
            Else
                TX6X260B8FF(local0\Field4, local0\Field1, local0\Field3, $01)
            EndIf
        EndIf
    Next
    Return $00
End Function
