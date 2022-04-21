import { Injectable } from '@angular/core';
import { Item } from './item';

@Injectable({
  providedIn: 'root'
})
export class DataService {
  last: number = 0;

  itemList: Item[] = [];

  constructor() { }

  addItem(action: string): void {
    for (let i = 0; i < this.itemList.length; i++) {
      if (action == "") {
        alert("Item cannot be empty!");
        return;
      }
      if (this.itemList[i].title == action) {
        alert("Item alredy present in the Todo list!");
        return;
      }
    }

    const item: Item = {
      id : ++this.last,
      title: action
    }

    this.itemList.push(item);
  }

  deleteItem(id: number): void {
    this.itemList = this.itemList.filter(item => item.id != id);
  }
}
