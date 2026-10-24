Function Y0FFZFZ0Z%(arg0.TX2BF6X0FF4, arg1%, arg2%)
    Local local0%
    Local local1.decals
    Local local2#
    Local local3#
    Local local4#
    Local local5#
    Local local6.X44ZF6442X
    If (((TXB2BFFFFFX() And (arg0\Field46\Field46 = $00)) And ((arg0\Field46\Field47 = $00) Lor arg2)) <> 0) Then
        arg0\Field46\Field46 = $01
        arg0\Field46\Field12 = 260.0
        If (arg1 <> 0) Then
            local0 = createpivot($00)
            positionentity(local0, (entityx(arg0\Field52, $00, 1.0) + rnd(-0.1, 0.1)), (entityy(arg0\Field52, $00, 1.0) - 0.1), (entityz(arg0\Field52, $00, 1.0) + rnd(-0.1, 0.1)), $00)
            turnentity(local0, 90.0, 0.0, 0.0, $00)
            entitypick(local0, 0.5)
            local1 = createdecal($07, pickedx(), (pickedy() + 0.005), pickedz(), 90.0, rnd(360.0, 0.0), 0.0, 0.1, 1.0, $00, $01, $00, $00, $00)
            local1\Field14 = 0.0018
            local1\Field3 = 0.3
            local1\Field2 = 2800.0
            If (XXDB6F64F2[arg0\Field3] <> Null) Then
                entityparent(local1\Field0, XXDB6F64F2[arg0\Field3]\Field15, $01)
            EndIf
            XZ48406XD0(local1, arg0\Field3)
            freeentity(local0)
            local0 = $00
        EndIf
        If (arg0\Field55\Field21 > $00) Then
            If (arg0\Field46\Field13 <> Null) Then
                arg0\Field46\Field13\Field17 = $00
            EndIf
            If (arg0\Field13 = TXXDZB2ZBXX()) Then
                local6 = T60880B62X(arg0\Field55\Field21)
                local2 = entityx(arg0\Field52, $00, 1.0)
                local3 = (entityy(arg0\Field52, $00, 1.0) + local6\Field56)
                local4 = entityz(arg0\Field52, $00, 1.0)
                local5 = (entityyaw(arg0\Field52, $00, 1.0) - local6\Field47)
            ElseIf (arg0\Field55\Field7 <> $00) Then
                local2 = entityx(arg0\Field55\Field7, $01, 1.0)
                local3 = entityy(arg0\Field55\Field7, $01, 1.0)
                local4 = entityz(arg0\Field55\Field7, $01, 1.0)
                local5 = entityyaw(arg0\Field55\Field7, $01, 1.0)
            EndIf
            arg0\Field46\Field13 = TF4F86X6ZZ(local2, local3, local4, local5, arg0\Field55\Field21, arg0\Field55\Field16, arg0, $00, $FFFFFFFF, $00)
            If (X40BFXDD8B(arg0) = $02) Then
                TXXFD8262F2(arg0\Field46\Field13, TX4X28D4B20(arg0), TZDZ46F4B2(arg0))
            EndIf
        EndIf
        arg0\Field5 = $00
    EndIf
    Return $00
End Function
