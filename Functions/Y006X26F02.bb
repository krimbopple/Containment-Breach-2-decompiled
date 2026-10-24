Function Y006X26F02%(arg0.rooms, arg1.Y0D6F4BXB0)
    Local local0.X4X6Z4D6F2
    local0 = (New X4X6Z4D6F2)
    local0\Field0 = createpivot(arg0\Field15)
    local0\Field3 = arg0
    local0\Field2 = arg1
    local0\Field1 = (arg1\Field19 - arg0\Field21)
    positionentity(local0\Field0, arg1\Field20, arg1\Field3, arg1\Field18, $00)
    scaleentity(local0\Field0, ((arg1\Field16 - arg1\Field15) * arg1\Field17), ((arg1\Field5 - arg1\Field10) * arg1\Field14), ((arg1\Field12 - arg1\Field21) * arg1\Field22), $00)
    rotateentity(local0\Field0, arg1\Field2, arg1\Field13, arg1\Field1, $00)
    entitydestructor(local0\Field0, FuncPtr(TX6D84DF0X2))
    Return $00
End Function
